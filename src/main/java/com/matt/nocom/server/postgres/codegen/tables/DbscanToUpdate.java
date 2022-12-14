/*
 * This file is generated by jOOQ.
 */
package com.matt.nocom.server.postgres.codegen.tables;


import com.matt.nocom.server.postgres.codegen.DefaultSchema;
import com.matt.nocom.server.postgres.codegen.Keys;
import com.matt.nocom.server.postgres.codegen.tables.records.DbscanToUpdateRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DbscanToUpdate extends TableImpl<DbscanToUpdateRecord> {

    private static final long serialVersionUID = 884833692;

    /**
     * The reference instance of <code>dbscan_to_update</code>
     */
    public static final DbscanToUpdate DBSCAN_TO_UPDATE = new DbscanToUpdate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DbscanToUpdateRecord> getRecordType() {
        return DbscanToUpdateRecord.class;
    }

    /**
     * The column <code>dbscan_to_update.dbscan_id</code>.
     */
    public final TableField<DbscanToUpdateRecord, Integer> DBSCAN_ID = createField(DSL.name("dbscan_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>dbscan_to_update.updatable_lower</code>.
     */
    public final TableField<DbscanToUpdateRecord, Long> UPDATABLE_LOWER = createField(DSL.name("updatable_lower"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>dbscan_to_update.updatable_upper</code>.
     */
    public final TableField<DbscanToUpdateRecord, Long> UPDATABLE_UPPER = createField(DSL.name("updatable_upper"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>dbscan_to_update</code> table reference
     */
    public DbscanToUpdate() {
        this(DSL.name("dbscan_to_update"), null);
    }

    /**
     * Create an aliased <code>dbscan_to_update</code> table reference
     */
    public DbscanToUpdate(String alias) {
        this(DSL.name(alias), DBSCAN_TO_UPDATE);
    }

    /**
     * Create an aliased <code>dbscan_to_update</code> table reference
     */
    public DbscanToUpdate(Name alias) {
        this(alias, DBSCAN_TO_UPDATE);
    }

    private DbscanToUpdate(Name alias, Table<DbscanToUpdateRecord> aliased) {
        this(alias, aliased, null);
    }

    private DbscanToUpdate(Name alias, Table<DbscanToUpdateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> DbscanToUpdate(Table<O> child, ForeignKey<O, DbscanToUpdateRecord> key) {
        super(child, key, DBSCAN_TO_UPDATE);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<DbscanToUpdateRecord> getPrimaryKey() {
        return Keys.DBSCAN_TO_UPDATE_PKEY;
    }

    @Override
    public List<UniqueKey<DbscanToUpdateRecord>> getKeys() {
        return Arrays.<UniqueKey<DbscanToUpdateRecord>>asList(Keys.DBSCAN_TO_UPDATE_PKEY);
    }

    @Override
    public List<ForeignKey<DbscanToUpdateRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DbscanToUpdateRecord, ?>>asList(Keys.DBSCAN_TO_UPDATE__DBSCAN_TO_UPDATE_DBSCAN_ID_FKEY1);
    }

    public Dbscan dbscan() {
        return new Dbscan(this, Keys.DBSCAN_TO_UPDATE__DBSCAN_TO_UPDATE_DBSCAN_ID_FKEY1);
    }

    @Override
    public DbscanToUpdate as(String alias) {
        return new DbscanToUpdate(DSL.name(alias), this);
    }

    @Override
    public DbscanToUpdate as(Name alias) {
        return new DbscanToUpdate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DbscanToUpdate rename(String name) {
        return new DbscanToUpdate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DbscanToUpdate rename(Name name) {
        return new DbscanToUpdate(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
