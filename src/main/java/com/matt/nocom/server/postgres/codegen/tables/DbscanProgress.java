/*
 * This file is generated by jOOQ.
 */
package com.matt.nocom.server.postgres.codegen.tables;


import com.matt.nocom.server.postgres.codegen.DefaultSchema;
import com.matt.nocom.server.postgres.codegen.tables.records.DbscanProgressRecord;
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
public class DbscanProgress extends TableImpl<DbscanProgressRecord> {

    private static final long serialVersionUID = -1332328734;

    /**
     * The reference instance of <code>dbscan_progress</code>
     */
    public static final DbscanProgress DBSCAN_PROGRESS = new DbscanProgress();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DbscanProgressRecord> getRecordType() {
        return DbscanProgressRecord.class;
    }

    /**
     * The column <code>dbscan_progress.last_processed_hit_id</code>.
     */
    public final TableField<DbscanProgressRecord, Long> LAST_PROCESSED_HIT_ID = createField(DSL.name("last_processed_hit_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>dbscan_progress</code> table reference
     */
    public DbscanProgress() {
        this(DSL.name("dbscan_progress"), null);
    }

    /**
     * Create an aliased <code>dbscan_progress</code> table reference
     */
    public DbscanProgress(String alias) {
        this(DSL.name(alias), DBSCAN_PROGRESS);
    }

    /**
     * Create an aliased <code>dbscan_progress</code> table reference
     */
    public DbscanProgress(Name alias) {
        this(alias, DBSCAN_PROGRESS);
    }

    private DbscanProgress(Name alias, Table<DbscanProgressRecord> aliased) {
        this(alias, aliased, null);
    }

    private DbscanProgress(Name alias, Table<DbscanProgressRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> DbscanProgress(Table<O> child, ForeignKey<O, DbscanProgressRecord> key) {
        super(child, key, DBSCAN_PROGRESS);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public DbscanProgress as(String alias) {
        return new DbscanProgress(DSL.name(alias), this);
    }

    @Override
    public DbscanProgress as(Name alias) {
        return new DbscanProgress(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DbscanProgress rename(String name) {
        return new DbscanProgress(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DbscanProgress rename(Name name) {
        return new DbscanProgress(name, null);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<Long> fieldsRow() {
        return (Row1) super.fieldsRow();
    }
}
