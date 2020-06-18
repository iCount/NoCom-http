/*
 * This file is generated by jOOQ.
 */
package com.matt.nocom.server.postgres.codegen.tables;


import com.matt.nocom.server.postgres.codegen.DefaultSchema;
import com.matt.nocom.server.postgres.codegen.Indexes;
import com.matt.nocom.server.postgres.codegen.Keys;
import com.matt.nocom.server.postgres.codegen.tables.records.TracksRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.processing.Generated;
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
public class Tracks extends TableImpl<TracksRecord> {

    private static final long serialVersionUID = -1611274803;

    /**
     * The reference instance of <code>tracks</code>
     */
    public static final Tracks TRACKS = new Tracks();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TracksRecord> getRecordType() {
        return TracksRecord.class;
    }

    /**
     * The column <code>tracks.id</code>.
     */
    public final TableField<TracksRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('tracks_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>tracks.first_hit_id</code>.
     */
    public final TableField<TracksRecord, Long> FIRST_HIT_ID = createField(DSL.name("first_hit_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>tracks.last_hit_id</code>.
     */
    public final TableField<TracksRecord, Long> LAST_HIT_ID = createField(DSL.name("last_hit_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>tracks.updated_at</code>.
     */
    public final TableField<TracksRecord, Long> UPDATED_AT = createField(DSL.name("updated_at"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>tracks.dimension</code>.
     */
    public final TableField<TracksRecord, Short> DIMENSION = createField(DSL.name("dimension"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>tracks.server_id</code>.
     */
    public final TableField<TracksRecord, Short> SERVER_ID = createField(DSL.name("server_id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>tracks.prev_track_id</code>.
     */
    public final TableField<TracksRecord, Integer> PREV_TRACK_ID = createField(DSL.name("prev_track_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>tracks.legacy</code>.
     */
    public final TableField<TracksRecord, Boolean> LEGACY = createField(DSL.name("legacy"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>tracks</code> table reference
     */
    public Tracks() {
        this(DSL.name("tracks"), null);
    }

    /**
     * Create an aliased <code>tracks</code> table reference
     */
    public Tracks(String alias) {
        this(DSL.name(alias), TRACKS);
    }

    /**
     * Create an aliased <code>tracks</code> table reference
     */
    public Tracks(Name alias) {
        this(alias, TRACKS);
    }

    private Tracks(Name alias, Table<TracksRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tracks(Name alias, Table<TracksRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Tracks(Table<O> child, ForeignKey<O, TracksRecord> key) {
        super(child, key, TRACKS);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TRACK_ENDINGS, Indexes.TRACKS_LEGACY, Indexes.TRACKS_PKEY);
    }

    @Override
    public Identity<TracksRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TRACKS;
    }

    @Override
    public UniqueKey<TracksRecord> getPrimaryKey() {
        return Keys.TRACKS_PKEY;
    }

    @Override
    public List<UniqueKey<TracksRecord>> getKeys() {
        return Arrays.<UniqueKey<TracksRecord>>asList(Keys.TRACKS_PKEY);
    }

    @Override
    public List<ForeignKey<TracksRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TracksRecord, ?>>asList(Keys.TRACKS__TRACKS_FIRST_HIT_ID_FKEY, Keys.TRACKS__TRACKS_LAST_HIT_ID_FKEY, Keys.TRACKS__TRACKS_DIMENSION_FKEY, Keys.TRACKS__TRACKS_SERVER_ID_FKEY, Keys.TRACKS__TRACKS_PREV_TRACK_ID_FKEY);
    }

    public Hits tracks_TracksFirstHitIdFkey() {
        return new Hits(this, Keys.TRACKS__TRACKS_FIRST_HIT_ID_FKEY);
    }

    public Hits tracks_TracksLastHitIdFkey() {
        return new Hits(this, Keys.TRACKS__TRACKS_LAST_HIT_ID_FKEY);
    }

    public Dimensions dimensions() {
        return new Dimensions(this, Keys.TRACKS__TRACKS_DIMENSION_FKEY);
    }

    public Servers servers() {
        return new Servers(this, Keys.TRACKS__TRACKS_SERVER_ID_FKEY);
    }

    public com.matt.nocom.server.postgres.codegen.tables.Tracks tracks() {
        return new com.matt.nocom.server.postgres.codegen.tables.Tracks(this, Keys.TRACKS__TRACKS_PREV_TRACK_ID_FKEY);
    }

    @Override
    public Tracks as(String alias) {
        return new Tracks(DSL.name(alias), this);
    }

    @Override
    public Tracks as(Name alias) {
        return new Tracks(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tracks rename(String name) {
        return new Tracks(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tracks rename(Name name) {
        return new Tracks(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Long, Long, Long, Short, Short, Integer, Boolean> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
