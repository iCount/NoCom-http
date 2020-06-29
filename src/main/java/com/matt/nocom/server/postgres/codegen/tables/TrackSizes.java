/*
 * This file is generated by jOOQ.
 */
package com.matt.nocom.server.postgres.codegen.tables;


import com.matt.nocom.server.postgres.codegen.DefaultSchema;
import com.matt.nocom.server.postgres.codegen.tables.records.TrackSizesRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.processing.Generated;


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
public class TrackSizes extends TableImpl<TrackSizesRecord> {

    private static final long serialVersionUID = -1742221801;

    /**
     * The reference instance of <code>track_sizes</code>
     */
    public static final TrackSizes TRACK_SIZES = new TrackSizes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TrackSizesRecord> getRecordType() {
        return TrackSizesRecord.class;
    }

    /**
     * The column <code>track_sizes.track_id</code>.
     */
    public final TableField<TrackSizesRecord, Integer> TRACK_ID = createField(DSL.name("track_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>track_sizes.cnt</code>.
     */
    public final TableField<TrackSizesRecord, Long> CNT = createField(DSL.name("cnt"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>track_sizes</code> table reference
     */
    public TrackSizes() {
        this(DSL.name("track_sizes"), null);
    }

    /**
     * Create an aliased <code>track_sizes</code> table reference
     */
    public TrackSizes(String alias) {
        this(DSL.name(alias), TRACK_SIZES);
    }

    /**
     * Create an aliased <code>track_sizes</code> table reference
     */
    public TrackSizes(Name alias) {
        this(alias, TRACK_SIZES);
    }

    private TrackSizes(Name alias, Table<TrackSizesRecord> aliased) {
        this(alias, aliased, null);
    }

    private TrackSizes(Name alias, Table<TrackSizesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TrackSizes(Table<O> child, ForeignKey<O, TrackSizesRecord> key) {
        super(child, key, TRACK_SIZES);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public TrackSizes as(String alias) {
        return new TrackSizes(DSL.name(alias), this);
    }

    @Override
    public TrackSizes as(Name alias) {
        return new TrackSizes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TrackSizes rename(String name) {
        return new TrackSizes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TrackSizes rename(Name name) {
        return new TrackSizes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}