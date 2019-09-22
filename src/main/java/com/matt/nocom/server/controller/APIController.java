package com.matt.nocom.server.controller;

import com.google.common.base.MoreObjects;
import com.matt.nocom.server.Logging;
import com.matt.nocom.server.minecraft.world.MinecraftWorld;
import com.matt.nocom.server.model.shared.data.Dimension;
import com.matt.nocom.server.model.sql.data.Location;
import com.matt.nocom.server.model.http.data.LocationGroup;
import com.matt.nocom.server.model.sql.data.RegionFileData;
import com.matt.nocom.server.model.http.data.RegionFileFilter;
import com.matt.nocom.server.model.sql.data.Position;
import com.matt.nocom.server.model.http.data.SearchFilter;
import com.matt.nocom.server.service.APIService;
import com.matt.nocom.server.service.EventService;
import com.matt.nocom.server.util.EventTypeRegistry;
import com.matt.nocom.server.util.factory.LocationGroupFactory;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.Collectors;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("api")
@PropertySource("database.properties")
public class APIController implements Logging {
  private final Environment env;
  private final APIService api;
  private final EventService events;

  public APIController(Environment env, APIService api,
      EventService events) {
    this.env = env;
    this.api = api;
    this.events = events;
  }

  @RequestMapping(value = "/upload/locations",
      method = RequestMethod.POST,
      consumes = "application/json",
      produces = "application/json")
  @ResponseStatus(HttpStatus.OK)
  @ResponseBody
  public void addLocations(@RequestBody Location[] locations) {
    if (locations.length < 1)
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
          "Must contain at least one location object.");

    int n; // count of inserts

    n = Arrays.stream(
        api.addServers(Arrays.stream(locations)
            .map(Location::getServer)
            .map(String::toLowerCase)
            .collect(Collectors.toSet()))
    ).sum();

    if(n > 0)
      events.publishInfo(EventTypeRegistry.API__ADD_LOCATION__SERVERS, "Added %d new servers", n);

    n = Arrays.stream(
        api.addPositions(Arrays.stream(locations)
            .map(Location::toPosition)
            .collect(Collectors.toSet()))
    ).sum();

    if(n > 0)
      events.publishInfo(EventTypeRegistry.API__ADD_LOCATION__POSITIONS, "Added %d new unique coordinates", n);

    n = Arrays.stream(
        api.addLocations(Arrays.asList(locations))
    ).sum();

    if(n > 0)
      events.publishInfo(EventTypeRegistry.API__ADD_LOCATION, "Added %d total locations", n);
  }

  @RequestMapping(value = "/search/locations",
      method = RequestMethod.POST ,
      consumes = "application/json",
      produces = "application/json")
  @ResponseBody
  public ResponseEntity<Location[]> getLocations(@RequestBody SearchFilter filter) {
    return ResponseEntity.ok(api.getLocations(filter).toArray(new Location[0]));
  }

  @RequestMapping(value = "/search/group/locations",
      method = RequestMethod.POST ,
      consumes = "application/json",
      produces = "application/json")
  @ResponseBody
  public ResponseEntity<LocationGroup[]> getLocationGroups(@RequestBody SearchFilter filter) {
    filter.forceGrouping();
    return ResponseEntity.ok(
        LocationGroupFactory.translate2(api.getLocations(filter), filter.getGroupingRange()).stream()
            .filter(g -> g.getPositions().size() >= MoreObjects.firstNonNull(filter.getMinHits(), 0))
            .toArray(LocationGroup[]::new)
    );
  }


  @RequestMapping(value = "/search/locations/list",
      method = RequestMethod.POST ,
      consumes = "application/json",
      produces = MediaType.TEXT_PLAIN_VALUE)
  @ResponseBody
  public ResponseEntity<String> listLocations(@RequestBody SearchFilter filter) {
    return ResponseEntity.ok(api.getLocations(filter).stream()
        .map(Location::toPosition)
        .map(Position::toString)
        .collect(Collectors.joining("\n")));
  }

  @RequestMapping(value = "/servers", method = RequestMethod.GET, produces = "application/json")
  @ResponseBody
  public ResponseEntity<String[]> getServers() {
    return ResponseEntity.ok(api.getServers().toArray(new String[0]));
  }

  @RequestMapping(value = "/dimensions", method = RequestMethod.GET, produces = "application/json")
  @ResponseBody
  public ResponseEntity<Dimension[]> getDimensions() {
    return ResponseEntity.ok(api.getDimensions().toArray(new Dimension[0]));
  }

  @RequestMapping(value = "/download/region",
      method = RequestMethod.POST,
      consumes = "application/json")
  public ResponseEntity<Resource> downloadRegionFile(@RequestBody RegionFileFilter request) {
    Path filePath = new MinecraftWorld(request.getServer())
        .ofType(request.getType())
        .dimension(request.getDimension())
        .getRegionAt(request.getX(), request.getZ());

    if (!Files.exists(filePath)) {
      return ResponseEntity.notFound().build();
    }

    try {
      Resource resource = new FileSystemResource(filePath);

      return ResponseEntity.ok()
          .contentLength(resource.contentLength())
          .contentType(MediaType.APPLICATION_OCTET_STREAM)
          .body(resource);

    } catch (IOException ex) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
          .header("cause", ex.toString())
          .build();
    }
  }

  @RequestMapping(value = "/upload/region",
      method = RequestMethod.POST,
      consumes = "application/json",
      produces = "application/json")
  @ResponseStatus(HttpStatus.OK)
  @ResponseBody
  public ResponseEntity addRegionFile(@RequestBody RegionFileData regionData) {
    final Path path = new MinecraftWorld(regionData.getServer())
        .ofType(regionData.getType())
        .dimension(regionData.getDimension())
        .getRegionAt(regionData.getX(), regionData.getZ());

    try {
      // TODO: rename already existing files
      Files.write(path, Base64.getDecoder().decode(regionData.getBase64Data()), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

      return ResponseEntity.ok().build();
    } catch (IOException ex) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.toString());
    }
  }

  @RequestMapping(value = "/database/download",
      method = RequestMethod.GET)
  @ResponseStatus(HttpStatus.OK)
  @ResponseBody
  public ResponseEntity<Resource> databaseDownload() throws IOException {
    events.publishInfo(EventTypeRegistry.API__DOWNLOAD_DATABASE, "Downloaded the database");

    Path path = Paths.get("")
        .resolve(env.getRequiredProperty("db.file"));

    ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));

    return ResponseEntity.ok()
        .header("Content-Disposition", "attachment; filename=" + path.getFileName().toString())
        .contentLength(Files.size(path))
        .contentType(MediaType.parseMediaType("application/octet-stream"))
        .body(resource);
  }
}
