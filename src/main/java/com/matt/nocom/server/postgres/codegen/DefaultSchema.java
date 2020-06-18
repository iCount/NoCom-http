/*
 * This file is generated by jOOQ.
 */
package com.matt.nocom.server.postgres.codegen;


import com.matt.nocom.server.postgres.codegen.tables.*;
import com.matt.nocom.server.postgres.codegen.tables.records.StDumpRecord;
import com.matt.nocom.server.postgres.codegen.tables.records.StDumppointsRecord;
import com.matt.nocom.server.postgres.codegen.tables.records.StDumpringsRecord;
import com.matt.nocom.server.postgres.codegen.tables.records.StSubdivideRecord;
import com.matt.nocom.server.postgres.codegen.udt.GeometryDump;
import com.matt.nocom.server.postgres.codegen.udt.ValidDetail;
import org.jooq.*;
import org.jooq.impl.SchemaImpl;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = 1789614299;

    /**
     * The reference instance of <code></code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>assoc</code>.
     */
    public final Assoc ASSOC = com.matt.nocom.server.postgres.codegen.tables.Assoc.ASSOC;

    /**
     * The table <code>associations</code>.
     */
    public final Associations ASSOCIATIONS = com.matt.nocom.server.postgres.codegen.tables.Associations.ASSOCIATIONS;

    /**
     * The table <code>blocks</code>.
     */
    public final Blocks BLOCKS = com.matt.nocom.server.postgres.codegen.tables.Blocks.BLOCKS;

    /**
     * The table <code>chat</code>.
     */
    public final Chat CHAT = com.matt.nocom.server.postgres.codegen.tables.Chat.CHAT;

    /**
     * The table <code>dbscan</code>.
     */
    public final Dbscan DBSCAN = com.matt.nocom.server.postgres.codegen.tables.Dbscan.DBSCAN;

    /**
     * The table <code>dbscan_progress</code>.
     */
    public final DbscanProgress DBSCAN_PROGRESS = com.matt.nocom.server.postgres.codegen.tables.DbscanProgress.DBSCAN_PROGRESS;

    /**
     * The table <code>dbscan_to_update</code>.
     */
    public final DbscanToUpdate DBSCAN_TO_UPDATE = com.matt.nocom.server.postgres.codegen.tables.DbscanToUpdate.DBSCAN_TO_UPDATE;

    /**
     * The table <code>dimensions</code>.
     */
    public final Dimensions DIMENSIONS = com.matt.nocom.server.postgres.codegen.tables.Dimensions.DIMENSIONS;

    /**
     * The table <code>geography_columns</code>.
     */
    public final GeographyColumns GEOGRAPHY_COLUMNS = com.matt.nocom.server.postgres.codegen.tables.GeographyColumns.GEOGRAPHY_COLUMNS;

    /**
     * The table <code>geometry_columns</code>.
     */
    public final GeometryColumns GEOMETRY_COLUMNS = com.matt.nocom.server.postgres.codegen.tables.GeometryColumns.GEOMETRY_COLUMNS;

    /**
     * The table <code>heatmap_nether</code>.
     */
    public final HeatmapNether HEATMAP_NETHER = com.matt.nocom.server.postgres.codegen.tables.HeatmapNether.HEATMAP_NETHER;

    /**
     * The table <code>heatmap_overworld</code>.
     */
    public final HeatmapOverworld HEATMAP_OVERWORLD = com.matt.nocom.server.postgres.codegen.tables.HeatmapOverworld.HEATMAP_OVERWORLD;

    /**
     * The table <code>heatmap_recent_overworld</code>.
     */
    public final HeatmapRecentOverworld HEATMAP_RECENT_OVERWORLD = com.matt.nocom.server.postgres.codegen.tables.HeatmapRecentOverworld.HEATMAP_RECENT_OVERWORLD;

    /**
     * The table <code>hits</code>.
     */
    public final Hits HITS = com.matt.nocom.server.postgres.codegen.tables.Hits.HITS;

    /**
     * The table <code>last_by_server</code>.
     */
    public final LastByServer LAST_BY_SERVER = com.matt.nocom.server.postgres.codegen.tables.LastByServer.LAST_BY_SERVER;

    /**
     * The table <code>notes</code>.
     */
    public final Notes NOTES = com.matt.nocom.server.postgres.codegen.tables.Notes.NOTES;

    /**
     * The table <code>player_sessions</code>.
     */
    public final PlayerSessions PLAYER_SESSIONS = com.matt.nocom.server.postgres.codegen.tables.PlayerSessions.PLAYER_SESSIONS;

    /**
     * The table <code>players</code>.
     */
    public final Players PLAYERS = com.matt.nocom.server.postgres.codegen.tables.Players.PLAYERS;

    /**
     * The table <code>servers</code>.
     */
    public final Servers SERVERS = com.matt.nocom.server.postgres.codegen.tables.Servers.SERVERS;

    /**
     * The table <code>signs</code>.
     */
    public final Signs SIGNS = com.matt.nocom.server.postgres.codegen.tables.Signs.SIGNS;

    /**
     * The table <code>spatial_ref_sys</code>.
     */
    public final SpatialRefSys SPATIAL_REF_SYS = com.matt.nocom.server.postgres.codegen.tables.SpatialRefSys.SPATIAL_REF_SYS;

    /**
     * The table <code>st_dump</code>.
     */
    public final StDump ST_DUMP = com.matt.nocom.server.postgres.codegen.tables.StDump.ST_DUMP;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<StDumpRecord> ST_DUMP(Configuration configuration, Object __1) {
        return configuration.dsl().selectFrom(com.matt.nocom.server.postgres.codegen.tables.StDump.ST_DUMP.call(__1)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StDump ST_DUMP(Object __1) {
        return com.matt.nocom.server.postgres.codegen.tables.StDump.ST_DUMP.call(__1);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StDump ST_DUMP(Field<Object> __1) {
        return com.matt.nocom.server.postgres.codegen.tables.StDump.ST_DUMP.call(__1);
    }

    /**
     * The table <code>st_dumppoints</code>.
     */
    public final StDumppoints ST_DUMPPOINTS = com.matt.nocom.server.postgres.codegen.tables.StDumppoints.ST_DUMPPOINTS;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<StDumppointsRecord> ST_DUMPPOINTS(Configuration configuration, Object __1) {
        return configuration.dsl().selectFrom(com.matt.nocom.server.postgres.codegen.tables.StDumppoints.ST_DUMPPOINTS.call(__1)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StDumppoints ST_DUMPPOINTS(Object __1) {
        return com.matt.nocom.server.postgres.codegen.tables.StDumppoints.ST_DUMPPOINTS.call(__1);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StDumppoints ST_DUMPPOINTS(Field<Object> __1) {
        return com.matt.nocom.server.postgres.codegen.tables.StDumppoints.ST_DUMPPOINTS.call(__1);
    }

    /**
     * The table <code>st_dumprings</code>.
     */
    public final StDumprings ST_DUMPRINGS = com.matt.nocom.server.postgres.codegen.tables.StDumprings.ST_DUMPRINGS;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<StDumpringsRecord> ST_DUMPRINGS(Configuration configuration, Object __1) {
        return configuration.dsl().selectFrom(com.matt.nocom.server.postgres.codegen.tables.StDumprings.ST_DUMPRINGS.call(__1)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StDumprings ST_DUMPRINGS(Object __1) {
        return com.matt.nocom.server.postgres.codegen.tables.StDumprings.ST_DUMPRINGS.call(__1);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StDumprings ST_DUMPRINGS(Field<Object> __1) {
        return com.matt.nocom.server.postgres.codegen.tables.StDumprings.ST_DUMPRINGS.call(__1);
    }

    /**
     * The table <code>st_subdivide</code>.
     */
    public final StSubdivide ST_SUBDIVIDE = com.matt.nocom.server.postgres.codegen.tables.StSubdivide.ST_SUBDIVIDE;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<StSubdivideRecord> ST_SUBDIVIDE(Configuration configuration, Object geom, Integer maxvertices) {
        return configuration.dsl().selectFrom(com.matt.nocom.server.postgres.codegen.tables.StSubdivide.ST_SUBDIVIDE.call(geom, maxvertices)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StSubdivide ST_SUBDIVIDE(Object geom, Integer maxvertices) {
        return com.matt.nocom.server.postgres.codegen.tables.StSubdivide.ST_SUBDIVIDE.call(geom, maxvertices);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static StSubdivide ST_SUBDIVIDE(Field<Object> geom, Field<Integer> maxvertices) {
        return com.matt.nocom.server.postgres.codegen.tables.StSubdivide.ST_SUBDIVIDE.call(geom, maxvertices);
    }

    /**
     * The table <code>statuses</code>.
     */
    public final Statuses STATUSES = com.matt.nocom.server.postgres.codegen.tables.Statuses.STATUSES;

    /**
     * The table <code>track_associator_progress</code>.
     */
    public final TrackAssociatorProgress TRACK_ASSOCIATOR_PROGRESS = com.matt.nocom.server.postgres.codegen.tables.TrackAssociatorProgress.TRACK_ASSOCIATOR_PROGRESS;

    /**
     * The table <code>track_sizes</code>.
     */
    public final TrackSizes TRACK_SIZES = com.matt.nocom.server.postgres.codegen.tables.TrackSizes.TRACK_SIZES;

    /**
     * The table <code>tracks</code>.
     */
    public final Tracks TRACKS = com.matt.nocom.server.postgres.codegen.tables.Tracks.TRACKS;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.DBSCAN_ID_SEQ,
            Sequences.HITS_ID_SEQ,
            Sequences.PLAYERS_ID_SEQ,
            Sequences.SERVERS_ID_SEQ,
            Sequences.TRACKS_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Assoc.ASSOC,
            Associations.ASSOCIATIONS,
            Blocks.BLOCKS,
            Chat.CHAT,
            Dbscan.DBSCAN,
            DbscanProgress.DBSCAN_PROGRESS,
            DbscanToUpdate.DBSCAN_TO_UPDATE,
            Dimensions.DIMENSIONS,
            GeographyColumns.GEOGRAPHY_COLUMNS,
            GeometryColumns.GEOMETRY_COLUMNS,
            HeatmapNether.HEATMAP_NETHER,
            HeatmapOverworld.HEATMAP_OVERWORLD,
            HeatmapRecentOverworld.HEATMAP_RECENT_OVERWORLD,
            Hits.HITS,
            LastByServer.LAST_BY_SERVER,
            Notes.NOTES,
            PlayerSessions.PLAYER_SESSIONS,
            Players.PLAYERS,
            Servers.SERVERS,
            Signs.SIGNS,
            SpatialRefSys.SPATIAL_REF_SYS,
            StDump.ST_DUMP,
            StDumppoints.ST_DUMPPOINTS,
            StDumprings.ST_DUMPRINGS,
            StSubdivide.ST_SUBDIVIDE,
            Statuses.STATUSES,
            TrackAssociatorProgress.TRACK_ASSOCIATOR_PROGRESS,
            TrackSizes.TRACK_SIZES,
            Tracks.TRACKS);
    }

    @Override
    public final List<UDT<?>> getUDTs() {
        List result = new ArrayList();
        result.addAll(getUDTs0());
        return result;
    }

    private final List<UDT<?>> getUDTs0() {
        return Arrays.<UDT<?>>asList(
            GeometryDump.GEOMETRY_DUMP,
            ValidDetail.VALID_DETAIL);
    }
}
