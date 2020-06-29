/*
 * This file is generated by jOOQ.
 */
package com.matt.nocom.server.postgres.codegen;


import com.matt.nocom.server.postgres.codegen.tables.*;
import com.matt.nocom.server.postgres.codegen.tables.records.StDumpRecord;
import com.matt.nocom.server.postgres.codegen.tables.records.StDumppointsRecord;
import com.matt.nocom.server.postgres.codegen.tables.records.StDumpringsRecord;
import com.matt.nocom.server.postgres.codegen.tables.records.StSubdivideRecord;
import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;

import javax.annotation.processing.Generated;


/**
 * Convenience access to all tables in 
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>blocks</code>.
     */
    public static final Blocks BLOCKS = Blocks.BLOCKS;

    /**
     * The table <code>chat</code>.
     */
    public static final Chat CHAT = Chat.CHAT;

    /**
     * The table <code>dbscan_progress</code>.
     */
    public static final DbscanProgress DBSCAN_PROGRESS = DbscanProgress.DBSCAN_PROGRESS;

    /**
     * The table <code>dimensions</code>.
     */
    public static final Dimensions DIMENSIONS = Dimensions.DIMENSIONS;

    /**
     * The table <code>geography_columns</code>.
     */
    public static final GeographyColumns GEOGRAPHY_COLUMNS = GeographyColumns.GEOGRAPHY_COLUMNS;

    /**
     * The table <code>geometry_columns</code>.
     */
    public static final GeometryColumns GEOMETRY_COLUMNS = GeometryColumns.GEOMETRY_COLUMNS;

    /**
     * The table <code>heatmap_nether</code>.
     */
    public static final HeatmapNether HEATMAP_NETHER = HeatmapNether.HEATMAP_NETHER;

    /**
     * The table <code>heatmap_overworld</code>.
     */
    public static final HeatmapOverworld HEATMAP_OVERWORLD = HeatmapOverworld.HEATMAP_OVERWORLD;

    /**
     * The table <code>heatmap_recent_overworld</code>.
     */
    public static final HeatmapRecentOverworld HEATMAP_RECENT_OVERWORLD = HeatmapRecentOverworld.HEATMAP_RECENT_OVERWORLD;

    /**
     * The table <code>hits</code>.
     */
    public static final Hits HITS = Hits.HITS;

    /**
     * The table <code>last_by_server</code>.
     */
    public static final LastByServer LAST_BY_SERVER = LastByServer.LAST_BY_SERVER;

    /**
     * The table <code>notes</code>.
     */
    public static final Notes NOTES = Notes.NOTES;

    /**
     * The table <code>old_assoc</code>.
     */
    public static final OldAssoc OLD_ASSOC = OldAssoc.OLD_ASSOC;

    /**
     * The table <code>old_associations</code>.
     */
    public static final OldAssociations OLD_ASSOCIATIONS = OldAssociations.OLD_ASSOCIATIONS;

    /**
     * The table <code>old_dbscan</code>.
     */
    public static final OldDbscan OLD_DBSCAN = OldDbscan.OLD_DBSCAN;

    /**
     * The table <code>old_dbscan_progress</code>.
     */
    public static final OldDbscanProgress OLD_DBSCAN_PROGRESS = OldDbscanProgress.OLD_DBSCAN_PROGRESS;

    /**
     * The table <code>old_dbscan_to_update</code>.
     */
    public static final OldDbscanToUpdate OLD_DBSCAN_TO_UPDATE = OldDbscanToUpdate.OLD_DBSCAN_TO_UPDATE;

    /**
     * The table <code>old_track_associator_progress</code>.
     */
    public static final OldTrackAssociatorProgress OLD_TRACK_ASSOCIATOR_PROGRESS = OldTrackAssociatorProgress.OLD_TRACK_ASSOCIATOR_PROGRESS;

    /**
     * The table <code>player_sessions</code>.
     */
    public static final PlayerSessions PLAYER_SESSIONS = PlayerSessions.PLAYER_SESSIONS;

    /**
     * The table <code>players</code>.
     */
    public static final Players PLAYERS = Players.PLAYERS;

    /**
     * The table <code>servers</code>.
     */
    public static final Servers SERVERS = Servers.SERVERS;

    /**
     * The table <code>signs</code>.
     */
    public static final Signs SIGNS = Signs.SIGNS;

    /**
     * The table <code>spatial_ref_sys</code>.
     */
    public static final SpatialRefSys SPATIAL_REF_SYS = SpatialRefSys.SPATIAL_REF_SYS;

    /**
     * The table <code>st_dump</code>.
     */
    public static final StDump ST_DUMP = StDump.ST_DUMP;

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
    public static final StDumppoints ST_DUMPPOINTS = StDumppoints.ST_DUMPPOINTS;

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
    public static final StDumprings ST_DUMPRINGS = StDumprings.ST_DUMPRINGS;

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
    public static final StSubdivide ST_SUBDIVIDE = StSubdivide.ST_SUBDIVIDE;

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
    public static final Statuses STATUSES = Statuses.STATUSES;

    /**
     * The table <code>test</code>.
     */
    public static final Test TEST = Test.TEST;

    /**
     * The table <code>track_sizes</code>.
     */
    public static final TrackSizes TRACK_SIZES = TrackSizes.TRACK_SIZES;

    /**
     * The table <code>tracks</code>.
     */
    public static final Tracks TRACKS = Tracks.TRACKS;
}