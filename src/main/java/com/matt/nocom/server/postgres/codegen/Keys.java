/*
 * This file is generated by jOOQ.
 */
package com.matt.nocom.server.postgres.codegen;


import com.matt.nocom.server.postgres.codegen.tables.*;
import com.matt.nocom.server.postgres.codegen.tables.records.*;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code></code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<DbscanRecord, Integer> IDENTITY_DBSCAN = Identities0.IDENTITY_DBSCAN;
    public static final Identity<HitsRecord, Long> IDENTITY_HITS = Identities0.IDENTITY_HITS;
    public static final Identity<OldDbscanRecord, Integer> IDENTITY_OLD_DBSCAN = Identities0.IDENTITY_OLD_DBSCAN;
    public static final Identity<PlayersRecord, Integer> IDENTITY_PLAYERS = Identities0.IDENTITY_PLAYERS;
    public static final Identity<ServersRecord, Short> IDENTITY_SERVERS = Identities0.IDENTITY_SERVERS;
    public static final Identity<TracksRecord, Integer> IDENTITY_TRACKS = Identities0.IDENTITY_TRACKS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<BlockStatesRecord> BLOCK_STATES_PKEY = UniqueKeys0.BLOCK_STATES_PKEY;
    public static final UniqueKey<DbscanRecord> DBSCAN_PKEY = UniqueKeys0.DBSCAN_PKEY;
    public static final UniqueKey<DbscanToUpdateRecord> DBSCAN_TO_UPDATE_PKEY = UniqueKeys0.DBSCAN_TO_UPDATE_PKEY;
    public static final UniqueKey<DimensionsRecord> DIMENSIONS_PKEY = UniqueKeys0.DIMENSIONS_PKEY;
    public static final UniqueKey<DimensionsRecord> DIMENSIONS_NAME_KEY = UniqueKeys0.DIMENSIONS_NAME_KEY;
    public static final UniqueKey<HitsRecord> HITS_PKEY_2 = UniqueKeys0.HITS_PKEY_2;
    public static final UniqueKey<LastByServerRecord> LAST_BY_SERVER_PKEY = UniqueKeys0.LAST_BY_SERVER_PKEY;
    public static final UniqueKey<NotesRecord> NOTES_SERVER_ID_DIMENSION_X_Z_KEY = UniqueKeys0.NOTES_SERVER_ID_DIMENSION_X_Z_KEY;
    public static final UniqueKey<OldDbscanRecord> OLD_DBSCAN_PKEY = UniqueKeys0.OLD_DBSCAN_PKEY;
    public static final UniqueKey<OldDbscanToUpdateRecord> OLD_DBSCAN_TO_UPDATE_PKEY = UniqueKeys0.OLD_DBSCAN_TO_UPDATE_PKEY;
    public static final UniqueKey<PlayersRecord> PLAYERS_PKEY = UniqueKeys0.PLAYERS_PKEY;
    public static final UniqueKey<PlayersRecord> PLAYERS_UUID_KEY = UniqueKeys0.PLAYERS_UUID_KEY;
    public static final UniqueKey<ServersRecord> SERVERS_PKEY = UniqueKeys0.SERVERS_PKEY;
    public static final UniqueKey<ServersRecord> SERVERS_HOSTNAME_KEY = UniqueKeys0.SERVERS_HOSTNAME_KEY;
    public static final UniqueKey<SpatialRefSysRecord> SPATIAL_REF_SYS_PKEY = UniqueKeys0.SPATIAL_REF_SYS_PKEY;
    public static final UniqueKey<StatusesRecord> STATUSES_PLAYER_ID_SERVER_ID_KEY = UniqueKeys0.STATUSES_PLAYER_ID_SERVER_ID_KEY;
    public static final UniqueKey<TracksRecord> TRACKS_PKEY = UniqueKeys0.TRACKS_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AssociationsRecord, DbscanRecord> ASSOCIATIONS__ASSOCIATIONS_CLUSTER_ID_FKEY1 = ForeignKeys0.ASSOCIATIONS__ASSOCIATIONS_CLUSTER_ID_FKEY1;
    public static final ForeignKey<AssociationsRecord, PlayersRecord> ASSOCIATIONS__ASSOCIATIONS_PLAYER_ID_FKEY1 = ForeignKeys0.ASSOCIATIONS__ASSOCIATIONS_PLAYER_ID_FKEY1;
    public static final ForeignKey<BlocksRecord, DimensionsRecord> BLOCKS__BLOCKS_DIMENSION_FKEY = ForeignKeys0.BLOCKS__BLOCKS_DIMENSION_FKEY;
    public static final ForeignKey<BlocksRecord, ServersRecord> BLOCKS__BLOCKS_SERVER_ID_FKEY = ForeignKeys0.BLOCKS__BLOCKS_SERVER_ID_FKEY;
    public static final ForeignKey<ChatRecord, PlayersRecord> CHAT__CHAT_REPORTED_BY_FKEY = ForeignKeys0.CHAT__CHAT_REPORTED_BY_FKEY;
    public static final ForeignKey<ChatRecord, ServersRecord> CHAT__CHAT_SERVER_ID_FKEY = ForeignKeys0.CHAT__CHAT_SERVER_ID_FKEY;
    public static final ForeignKey<DbscanRecord, DimensionsRecord> DBSCAN__DBSCAN_DIMENSION_FKEY1 = ForeignKeys0.DBSCAN__DBSCAN_DIMENSION_FKEY1;
    public static final ForeignKey<DbscanRecord, ServersRecord> DBSCAN__DBSCAN_SERVER_ID_FKEY1 = ForeignKeys0.DBSCAN__DBSCAN_SERVER_ID_FKEY1;
    public static final ForeignKey<DbscanRecord, DbscanRecord> DBSCAN__DBSCAN_CLUSTER_PARENT_FKEY1 = ForeignKeys0.DBSCAN__DBSCAN_CLUSTER_PARENT_FKEY1;
    public static final ForeignKey<DbscanToUpdateRecord, DbscanRecord> DBSCAN_TO_UPDATE__DBSCAN_TO_UPDATE_DBSCAN_ID_FKEY1 = ForeignKeys0.DBSCAN_TO_UPDATE__DBSCAN_TO_UPDATE_DBSCAN_ID_FKEY1;
    public static final ForeignKey<HitsRecord, ServersRecord> HITS__HITS_SERVER_ID_FKEY = ForeignKeys0.HITS__HITS_SERVER_ID_FKEY;
    public static final ForeignKey<HitsRecord, DimensionsRecord> HITS__HITS_DIMENSION_FKEY = ForeignKeys0.HITS__HITS_DIMENSION_FKEY;
    public static final ForeignKey<HitsRecord, TracksRecord> HITS__HITS_TRACK_ID_FKEY = ForeignKeys0.HITS__HITS_TRACK_ID_FKEY;
    public static final ForeignKey<LastByServerRecord, ServersRecord> LAST_BY_SERVER__LAST_BY_SERVER_SERVER_ID_FKEY = ForeignKeys0.LAST_BY_SERVER__LAST_BY_SERVER_SERVER_ID_FKEY;
    public static final ForeignKey<NotesRecord, DimensionsRecord> NOTES__NOTES_DIMENSION_FKEY = ForeignKeys0.NOTES__NOTES_DIMENSION_FKEY;
    public static final ForeignKey<NotesRecord, ServersRecord> NOTES__NOTES_SERVER_ID_FKEY = ForeignKeys0.NOTES__NOTES_SERVER_ID_FKEY;
    public static final ForeignKey<OldAssociationsRecord, OldDbscanRecord> OLD_ASSOCIATIONS__ASSOCIATIONS_CLUSTER_ID_FKEY = ForeignKeys0.OLD_ASSOCIATIONS__ASSOCIATIONS_CLUSTER_ID_FKEY;
    public static final ForeignKey<OldAssociationsRecord, PlayersRecord> OLD_ASSOCIATIONS__ASSOCIATIONS_PLAYER_ID_FKEY = ForeignKeys0.OLD_ASSOCIATIONS__ASSOCIATIONS_PLAYER_ID_FKEY;
    public static final ForeignKey<OldDbscanRecord, DimensionsRecord> OLD_DBSCAN__DBSCAN_DIMENSION_FKEY = ForeignKeys0.OLD_DBSCAN__DBSCAN_DIMENSION_FKEY;
    public static final ForeignKey<OldDbscanRecord, ServersRecord> OLD_DBSCAN__DBSCAN_SERVER_ID_FKEY = ForeignKeys0.OLD_DBSCAN__DBSCAN_SERVER_ID_FKEY;
    public static final ForeignKey<OldDbscanRecord, OldDbscanRecord> OLD_DBSCAN__DBSCAN_CLUSTER_PARENT_FKEY = ForeignKeys0.OLD_DBSCAN__DBSCAN_CLUSTER_PARENT_FKEY;
    public static final ForeignKey<OldDbscanToUpdateRecord, OldDbscanRecord> OLD_DBSCAN_TO_UPDATE__DBSCAN_TO_UPDATE_DBSCAN_ID_FKEY = ForeignKeys0.OLD_DBSCAN_TO_UPDATE__DBSCAN_TO_UPDATE_DBSCAN_ID_FKEY;
    public static final ForeignKey<PlayerSessionsRecord, PlayersRecord> PLAYER_SESSIONS__PLAYER_SESSIONS_PLAYER_ID_FKEY = ForeignKeys0.PLAYER_SESSIONS__PLAYER_SESSIONS_PLAYER_ID_FKEY;
    public static final ForeignKey<PlayerSessionsRecord, ServersRecord> PLAYER_SESSIONS__PLAYER_SESSIONS_SERVER_ID_FKEY = ForeignKeys0.PLAYER_SESSIONS__PLAYER_SESSIONS_SERVER_ID_FKEY;
    public static final ForeignKey<SignsRecord, DimensionsRecord> SIGNS__SIGNS_DIMENSION_FKEY = ForeignKeys0.SIGNS__SIGNS_DIMENSION_FKEY;
    public static final ForeignKey<SignsRecord, ServersRecord> SIGNS__SIGNS_SERVER_ID_FKEY = ForeignKeys0.SIGNS__SIGNS_SERVER_ID_FKEY;
    public static final ForeignKey<StatusesRecord, PlayersRecord> STATUSES__STATUSES_PLAYER_ID_FKEY = ForeignKeys0.STATUSES__STATUSES_PLAYER_ID_FKEY;
    public static final ForeignKey<StatusesRecord, ServersRecord> STATUSES__STATUSES_SERVER_ID_FKEY = ForeignKeys0.STATUSES__STATUSES_SERVER_ID_FKEY;
    public static final ForeignKey<StatusesRecord, DimensionsRecord> STATUSES__STATUSES_DIMENSION_FKEY = ForeignKeys0.STATUSES__STATUSES_DIMENSION_FKEY;
    public static final ForeignKey<TracksRecord, HitsRecord> TRACKS__TRACKS_FIRST_HIT_ID_FKEY = ForeignKeys0.TRACKS__TRACKS_FIRST_HIT_ID_FKEY;
    public static final ForeignKey<TracksRecord, HitsRecord> TRACKS__TRACKS_LAST_HIT_ID_FKEY = ForeignKeys0.TRACKS__TRACKS_LAST_HIT_ID_FKEY;
    public static final ForeignKey<TracksRecord, DimensionsRecord> TRACKS__TRACKS_DIMENSION_FKEY = ForeignKeys0.TRACKS__TRACKS_DIMENSION_FKEY;
    public static final ForeignKey<TracksRecord, ServersRecord> TRACKS__TRACKS_SERVER_ID_FKEY = ForeignKeys0.TRACKS__TRACKS_SERVER_ID_FKEY;
    public static final ForeignKey<TracksRecord, TracksRecord> TRACKS__TRACKS_PREV_TRACK_ID_FKEY = ForeignKeys0.TRACKS__TRACKS_PREV_TRACK_ID_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<DbscanRecord, Integer> IDENTITY_DBSCAN = Internal.createIdentity(Dbscan.DBSCAN, Dbscan.DBSCAN.ID);
        public static Identity<HitsRecord, Long> IDENTITY_HITS = Internal.createIdentity(Hits.HITS, Hits.HITS.ID);
        public static Identity<OldDbscanRecord, Integer> IDENTITY_OLD_DBSCAN = Internal.createIdentity(OldDbscan.OLD_DBSCAN, OldDbscan.OLD_DBSCAN.ID);
        public static Identity<PlayersRecord, Integer> IDENTITY_PLAYERS = Internal.createIdentity(Players.PLAYERS, Players.PLAYERS.ID);
        public static Identity<ServersRecord, Short> IDENTITY_SERVERS = Internal.createIdentity(Servers.SERVERS, Servers.SERVERS.ID);
        public static Identity<TracksRecord, Integer> IDENTITY_TRACKS = Internal.createIdentity(Tracks.TRACKS, Tracks.TRACKS.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<BlockStatesRecord> BLOCK_STATES_PKEY = Internal.createUniqueKey(BlockStates.BLOCK_STATES, "block_states_pkey", new TableField[] { BlockStates.BLOCK_STATES.BLOCK_STATE }, true);
        public static final UniqueKey<DbscanRecord> DBSCAN_PKEY = Internal.createUniqueKey(Dbscan.DBSCAN, "dbscan_pkey", new TableField[] { Dbscan.DBSCAN.ID }, true);
        public static final UniqueKey<DbscanToUpdateRecord> DBSCAN_TO_UPDATE_PKEY = Internal.createUniqueKey(DbscanToUpdate.DBSCAN_TO_UPDATE, "dbscan_to_update_pkey", new TableField[] { DbscanToUpdate.DBSCAN_TO_UPDATE.DBSCAN_ID }, true);
        public static final UniqueKey<DimensionsRecord> DIMENSIONS_PKEY = Internal.createUniqueKey(Dimensions.DIMENSIONS, "dimensions_pkey", new TableField[] { Dimensions.DIMENSIONS.ORDINAL }, true);
        public static final UniqueKey<DimensionsRecord> DIMENSIONS_NAME_KEY = Internal.createUniqueKey(Dimensions.DIMENSIONS, "dimensions_name_key", new TableField[] { Dimensions.DIMENSIONS.NAME }, true);
        public static final UniqueKey<HitsRecord> HITS_PKEY_2 = Internal.createUniqueKey(Hits.HITS, "hits_pkey_2", new TableField[] { Hits.HITS.ID }, true);
        public static final UniqueKey<LastByServerRecord> LAST_BY_SERVER_PKEY = Internal.createUniqueKey(LastByServer.LAST_BY_SERVER, "last_by_server_pkey", new TableField[] { LastByServer.LAST_BY_SERVER.SERVER_ID }, true);
        public static final UniqueKey<NotesRecord> NOTES_SERVER_ID_DIMENSION_X_Z_KEY = Internal.createUniqueKey(Notes.NOTES, "notes_server_id_dimension_x_z_key", new TableField[] { Notes.NOTES.SERVER_ID, Notes.NOTES.DIMENSION, Notes.NOTES.X, Notes.NOTES.Z }, true);
        public static final UniqueKey<OldDbscanRecord> OLD_DBSCAN_PKEY = Internal.createUniqueKey(OldDbscan.OLD_DBSCAN, "old_dbscan_pkey", new TableField[] { OldDbscan.OLD_DBSCAN.ID }, true);
        public static final UniqueKey<OldDbscanToUpdateRecord> OLD_DBSCAN_TO_UPDATE_PKEY = Internal.createUniqueKey(OldDbscanToUpdate.OLD_DBSCAN_TO_UPDATE, "old_dbscan_to_update_pkey", new TableField[] { OldDbscanToUpdate.OLD_DBSCAN_TO_UPDATE.DBSCAN_ID }, true);
        public static final UniqueKey<PlayersRecord> PLAYERS_PKEY = Internal.createUniqueKey(Players.PLAYERS, "players_pkey", new TableField[] { Players.PLAYERS.ID }, true);
        public static final UniqueKey<PlayersRecord> PLAYERS_UUID_KEY = Internal.createUniqueKey(Players.PLAYERS, "players_uuid_key", new TableField[] { Players.PLAYERS.UUID }, true);
        public static final UniqueKey<ServersRecord> SERVERS_PKEY = Internal.createUniqueKey(Servers.SERVERS, "servers_pkey", new TableField[] { Servers.SERVERS.ID }, true);
        public static final UniqueKey<ServersRecord> SERVERS_HOSTNAME_KEY = Internal.createUniqueKey(Servers.SERVERS, "servers_hostname_key", new TableField[] { Servers.SERVERS.HOSTNAME }, true);
        public static final UniqueKey<SpatialRefSysRecord> SPATIAL_REF_SYS_PKEY = Internal.createUniqueKey(SpatialRefSys.SPATIAL_REF_SYS, "spatial_ref_sys_pkey", new TableField[] { SpatialRefSys.SPATIAL_REF_SYS.SRID }, true);
        public static final UniqueKey<StatusesRecord> STATUSES_PLAYER_ID_SERVER_ID_KEY = Internal.createUniqueKey(Statuses.STATUSES, "statuses_player_id_server_id_key", new TableField[] { Statuses.STATUSES.PLAYER_ID, Statuses.STATUSES.SERVER_ID }, true);
        public static final UniqueKey<TracksRecord> TRACKS_PKEY = Internal.createUniqueKey(Tracks.TRACKS, "tracks_pkey", new TableField[] { Tracks.TRACKS.ID }, true);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<AssociationsRecord, DbscanRecord> ASSOCIATIONS__ASSOCIATIONS_CLUSTER_ID_FKEY1 = Internal.createForeignKey(Keys.DBSCAN_PKEY, Associations.ASSOCIATIONS, "associations_cluster_id_fkey1", new TableField[] { Associations.ASSOCIATIONS.CLUSTER_ID }, true);
        public static final ForeignKey<AssociationsRecord, PlayersRecord> ASSOCIATIONS__ASSOCIATIONS_PLAYER_ID_FKEY1 = Internal.createForeignKey(Keys.PLAYERS_PKEY, Associations.ASSOCIATIONS, "associations_player_id_fkey1", new TableField[] { Associations.ASSOCIATIONS.PLAYER_ID }, true);
        public static final ForeignKey<BlocksRecord, DimensionsRecord> BLOCKS__BLOCKS_DIMENSION_FKEY = Internal.createForeignKey(Keys.DIMENSIONS_PKEY, Blocks.BLOCKS, "blocks_dimension_fkey", new TableField[] { Blocks.BLOCKS.DIMENSION }, true);
        public static final ForeignKey<BlocksRecord, ServersRecord> BLOCKS__BLOCKS_SERVER_ID_FKEY = Internal.createForeignKey(Keys.SERVERS_PKEY, Blocks.BLOCKS, "blocks_server_id_fkey", new TableField[] { Blocks.BLOCKS.SERVER_ID }, true);
        public static final ForeignKey<ChatRecord, PlayersRecord> CHAT__CHAT_REPORTED_BY_FKEY = Internal.createForeignKey(Keys.PLAYERS_PKEY, Chat.CHAT, "chat_reported_by_fkey", new TableField[] { Chat.CHAT.REPORTED_BY }, true);
        public static final ForeignKey<ChatRecord, ServersRecord> CHAT__CHAT_SERVER_ID_FKEY = Internal.createForeignKey(Keys.SERVERS_PKEY, Chat.CHAT, "chat_server_id_fkey", new TableField[] { Chat.CHAT.SERVER_ID }, true);
        public static final ForeignKey<DbscanRecord, DimensionsRecord> DBSCAN__DBSCAN_DIMENSION_FKEY1 = Internal.createForeignKey(Keys.DIMENSIONS_PKEY, Dbscan.DBSCAN, "dbscan_dimension_fkey1", new TableField[] { Dbscan.DBSCAN.DIMENSION }, true);
        public static final ForeignKey<DbscanRecord, ServersRecord> DBSCAN__DBSCAN_SERVER_ID_FKEY1 = Internal.createForeignKey(Keys.SERVERS_PKEY, Dbscan.DBSCAN, "dbscan_server_id_fkey1", new TableField[] { Dbscan.DBSCAN.SERVER_ID }, true);
        public static final ForeignKey<DbscanRecord, DbscanRecord> DBSCAN__DBSCAN_CLUSTER_PARENT_FKEY1 = Internal.createForeignKey(Keys.DBSCAN_PKEY, Dbscan.DBSCAN, "dbscan_cluster_parent_fkey1", new TableField[] { Dbscan.DBSCAN.CLUSTER_PARENT }, true);
        public static final ForeignKey<DbscanToUpdateRecord, DbscanRecord> DBSCAN_TO_UPDATE__DBSCAN_TO_UPDATE_DBSCAN_ID_FKEY1 = Internal.createForeignKey(Keys.DBSCAN_PKEY, DbscanToUpdate.DBSCAN_TO_UPDATE, "dbscan_to_update_dbscan_id_fkey1", new TableField[] { DbscanToUpdate.DBSCAN_TO_UPDATE.DBSCAN_ID }, true);
        public static final ForeignKey<HitsRecord, ServersRecord> HITS__HITS_SERVER_ID_FKEY = Internal.createForeignKey(Keys.SERVERS_PKEY, Hits.HITS, "hits_server_id_fkey", new TableField[] { Hits.HITS.SERVER_ID }, true);
        public static final ForeignKey<HitsRecord, DimensionsRecord> HITS__HITS_DIMENSION_FKEY = Internal.createForeignKey(Keys.DIMENSIONS_PKEY, Hits.HITS, "hits_dimension_fkey", new TableField[] { Hits.HITS.DIMENSION }, true);
        public static final ForeignKey<HitsRecord, TracksRecord> HITS__HITS_TRACK_ID_FKEY = Internal.createForeignKey(Keys.TRACKS_PKEY, Hits.HITS, "hits_track_id_fkey", new TableField[] { Hits.HITS.TRACK_ID }, true);
        public static final ForeignKey<LastByServerRecord, ServersRecord> LAST_BY_SERVER__LAST_BY_SERVER_SERVER_ID_FKEY = Internal.createForeignKey(Keys.SERVERS_PKEY, LastByServer.LAST_BY_SERVER, "last_by_server_server_id_fkey", new TableField[] { LastByServer.LAST_BY_SERVER.SERVER_ID }, true);
        public static final ForeignKey<NotesRecord, DimensionsRecord> NOTES__NOTES_DIMENSION_FKEY = Internal.createForeignKey(Keys.DIMENSIONS_PKEY, Notes.NOTES, "notes_dimension_fkey", new TableField[] { Notes.NOTES.DIMENSION }, true);
        public static final ForeignKey<NotesRecord, ServersRecord> NOTES__NOTES_SERVER_ID_FKEY = Internal.createForeignKey(Keys.SERVERS_PKEY, Notes.NOTES, "notes_server_id_fkey", new TableField[] { Notes.NOTES.SERVER_ID }, true);
        public static final ForeignKey<OldAssociationsRecord, OldDbscanRecord> OLD_ASSOCIATIONS__ASSOCIATIONS_CLUSTER_ID_FKEY = Internal.createForeignKey(Keys.OLD_DBSCAN_PKEY, OldAssociations.OLD_ASSOCIATIONS, "associations_cluster_id_fkey", new TableField[] { OldAssociations.OLD_ASSOCIATIONS.CLUSTER_ID }, true);
        public static final ForeignKey<OldAssociationsRecord, PlayersRecord> OLD_ASSOCIATIONS__ASSOCIATIONS_PLAYER_ID_FKEY = Internal.createForeignKey(Keys.PLAYERS_PKEY, OldAssociations.OLD_ASSOCIATIONS, "associations_player_id_fkey", new TableField[] { OldAssociations.OLD_ASSOCIATIONS.PLAYER_ID }, true);
        public static final ForeignKey<OldDbscanRecord, DimensionsRecord> OLD_DBSCAN__DBSCAN_DIMENSION_FKEY = Internal.createForeignKey(Keys.DIMENSIONS_PKEY, OldDbscan.OLD_DBSCAN, "dbscan_dimension_fkey", new TableField[] { OldDbscan.OLD_DBSCAN.DIMENSION }, true);
        public static final ForeignKey<OldDbscanRecord, ServersRecord> OLD_DBSCAN__DBSCAN_SERVER_ID_FKEY = Internal.createForeignKey(Keys.SERVERS_PKEY, OldDbscan.OLD_DBSCAN, "dbscan_server_id_fkey", new TableField[] { OldDbscan.OLD_DBSCAN.SERVER_ID }, true);
        public static final ForeignKey<OldDbscanRecord, OldDbscanRecord> OLD_DBSCAN__DBSCAN_CLUSTER_PARENT_FKEY = Internal.createForeignKey(Keys.OLD_DBSCAN_PKEY, OldDbscan.OLD_DBSCAN, "dbscan_cluster_parent_fkey", new TableField[] { OldDbscan.OLD_DBSCAN.CLUSTER_PARENT }, true);
        public static final ForeignKey<OldDbscanToUpdateRecord, OldDbscanRecord> OLD_DBSCAN_TO_UPDATE__DBSCAN_TO_UPDATE_DBSCAN_ID_FKEY = Internal.createForeignKey(Keys.OLD_DBSCAN_PKEY, OldDbscanToUpdate.OLD_DBSCAN_TO_UPDATE, "dbscan_to_update_dbscan_id_fkey", new TableField[] { OldDbscanToUpdate.OLD_DBSCAN_TO_UPDATE.DBSCAN_ID }, true);
        public static final ForeignKey<PlayerSessionsRecord, PlayersRecord> PLAYER_SESSIONS__PLAYER_SESSIONS_PLAYER_ID_FKEY = Internal.createForeignKey(Keys.PLAYERS_PKEY, PlayerSessions.PLAYER_SESSIONS, "player_sessions_player_id_fkey", new TableField[] { PlayerSessions.PLAYER_SESSIONS.PLAYER_ID }, true);
        public static final ForeignKey<PlayerSessionsRecord, ServersRecord> PLAYER_SESSIONS__PLAYER_SESSIONS_SERVER_ID_FKEY = Internal.createForeignKey(Keys.SERVERS_PKEY, PlayerSessions.PLAYER_SESSIONS, "player_sessions_server_id_fkey", new TableField[] { PlayerSessions.PLAYER_SESSIONS.SERVER_ID }, true);
        public static final ForeignKey<SignsRecord, DimensionsRecord> SIGNS__SIGNS_DIMENSION_FKEY = Internal.createForeignKey(Keys.DIMENSIONS_PKEY, Signs.SIGNS, "signs_dimension_fkey", new TableField[] { Signs.SIGNS.DIMENSION }, true);
        public static final ForeignKey<SignsRecord, ServersRecord> SIGNS__SIGNS_SERVER_ID_FKEY = Internal.createForeignKey(Keys.SERVERS_PKEY, Signs.SIGNS, "signs_server_id_fkey", new TableField[] { Signs.SIGNS.SERVER_ID }, true);
        public static final ForeignKey<StatusesRecord, PlayersRecord> STATUSES__STATUSES_PLAYER_ID_FKEY = Internal.createForeignKey(Keys.PLAYERS_PKEY, Statuses.STATUSES, "statuses_player_id_fkey", new TableField[] { Statuses.STATUSES.PLAYER_ID }, true);
        public static final ForeignKey<StatusesRecord, ServersRecord> STATUSES__STATUSES_SERVER_ID_FKEY = Internal.createForeignKey(Keys.SERVERS_PKEY, Statuses.STATUSES, "statuses_server_id_fkey", new TableField[] { Statuses.STATUSES.SERVER_ID }, true);
        public static final ForeignKey<StatusesRecord, DimensionsRecord> STATUSES__STATUSES_DIMENSION_FKEY = Internal.createForeignKey(Keys.DIMENSIONS_PKEY, Statuses.STATUSES, "statuses_dimension_fkey", new TableField[] { Statuses.STATUSES.DIMENSION }, true);
        public static final ForeignKey<TracksRecord, HitsRecord> TRACKS__TRACKS_FIRST_HIT_ID_FKEY = Internal.createForeignKey(Keys.HITS_PKEY_2, Tracks.TRACKS, "tracks_first_hit_id_fkey", new TableField[] { Tracks.TRACKS.FIRST_HIT_ID }, true);
        public static final ForeignKey<TracksRecord, HitsRecord> TRACKS__TRACKS_LAST_HIT_ID_FKEY = Internal.createForeignKey(Keys.HITS_PKEY_2, Tracks.TRACKS, "tracks_last_hit_id_fkey", new TableField[] { Tracks.TRACKS.LAST_HIT_ID }, true);
        public static final ForeignKey<TracksRecord, DimensionsRecord> TRACKS__TRACKS_DIMENSION_FKEY = Internal.createForeignKey(Keys.DIMENSIONS_PKEY, Tracks.TRACKS, "tracks_dimension_fkey", new TableField[] { Tracks.TRACKS.DIMENSION }, true);
        public static final ForeignKey<TracksRecord, ServersRecord> TRACKS__TRACKS_SERVER_ID_FKEY = Internal.createForeignKey(Keys.SERVERS_PKEY, Tracks.TRACKS, "tracks_server_id_fkey", new TableField[] { Tracks.TRACKS.SERVER_ID }, true);
        public static final ForeignKey<TracksRecord, TracksRecord> TRACKS__TRACKS_PREV_TRACK_ID_FKEY = Internal.createForeignKey(Keys.TRACKS_PKEY, Tracks.TRACKS, "tracks_prev_track_id_fkey", new TableField[] { Tracks.TRACKS.PREV_TRACK_ID }, true);
    }
}
