/*
 * This file is generated by jOOQ.
 */
package com.matt.nocom.server.postgres.codegen.tables;


import com.matt.nocom.server.postgres.codegen.DefaultSchema;
import com.matt.nocom.server.postgres.codegen.Indexes;
import com.matt.nocom.server.postgres.codegen.Keys;
import com.matt.nocom.server.postgres.codegen.tables.records.DbscanRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
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
public class Dbscan extends TableImpl<DbscanRecord> {

    private static final long serialVersionUID = 1813288026;

    /**
     * The reference instance of <code>dbscan</code>
     */
    public static final Dbscan DBSCAN = new Dbscan();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DbscanRecord> getRecordType() {
        return DbscanRecord.class;
    }

    /**
     * The column <code>dbscan.id</code>.
     */
    public final TableField<DbscanRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('dbscan_id_seq1'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dbscan.x</code>.
     */
    public final TableField<DbscanRecord, Integer> X = createField(DSL.name("x"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>dbscan.z</code>.
     */
    public final TableField<DbscanRecord, Integer> Z = createField(DSL.name("z"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>dbscan.dimension</code>.
     */
    public final TableField<DbscanRecord, Short> DIMENSION = createField(DSL.name("dimension"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>dbscan.server_id</code>.
     */
    public final TableField<DbscanRecord, Short> SERVER_ID = createField(DSL.name("server_id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>dbscan.is_node</code>.
     */
    public final TableField<DbscanRecord, Boolean> IS_NODE = createField(DSL.name("is_node"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>dbscan.is_core</code>.
     */
    public final TableField<DbscanRecord, Boolean> IS_CORE = createField(DSL.name("is_core"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>dbscan.cluster_parent</code>.
     */
    public final TableField<DbscanRecord, Integer> CLUSTER_PARENT = createField(DSL.name("cluster_parent"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>dbscan.disjoint_rank</code>.
     */
    public final TableField<DbscanRecord, Integer> DISJOINT_RANK = createField(DSL.name("disjoint_rank"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>dbscan.disjoint_size</code>.
     */
    public final TableField<DbscanRecord, Integer> DISJOINT_SIZE = createField(DSL.name("disjoint_size"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>dbscan.root_updated_at</code>.
     */
    public final TableField<DbscanRecord, Long> ROOT_UPDATED_AT = createField(DSL.name("root_updated_at"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>dbscan.ts_ranges</code>.
     */
    public final TableField<DbscanRecord, Object[]> TS_RANGES = createField(DSL.name("ts_ranges"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"int8range\"").getArrayDataType(), this, "");

    /**
     * The column <code>dbscan.last_init_hit</code>.
     */
    public final TableField<DbscanRecord, Long> LAST_INIT_HIT = createField(DSL.name("last_init_hit"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>dbscan.first_init_hit</code>.
     */
    public final TableField<DbscanRecord, Long> FIRST_INIT_HIT = createField(DSL.name("first_init_hit"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>dbscan</code> table reference
     */
    public Dbscan() {
        this(DSL.name("dbscan"), null);
    }

    /**
     * Create an aliased <code>dbscan</code> table reference
     */
    public Dbscan(String alias) {
        this(DSL.name(alias), DBSCAN);
    }

    /**
     * Create an aliased <code>dbscan</code> table reference
     */
    public Dbscan(Name alias) {
        this(alias, DBSCAN);
    }

    private Dbscan(Name alias, Table<DbscanRecord> aliased) {
        this(alias, aliased, null);
    }

    private Dbscan(Name alias, Table<DbscanRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Dbscan(Table<O> child, ForeignKey<O, DbscanRecord> key) {
        super(child, key, DBSCAN);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.DBSCAN_CLUSTER_ROOTS, Indexes.DBSCAN_DISJOINT_TRAVERSAL, Indexes.DBSCAN_INGEST);
    }

    @Override
    public Identity<DbscanRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DBSCAN;
    }

    @Override
    public UniqueKey<DbscanRecord> getPrimaryKey() {
        return Keys.DBSCAN_PKEY;
    }

    @Override
    public List<UniqueKey<DbscanRecord>> getKeys() {
        return Arrays.<UniqueKey<DbscanRecord>>asList(Keys.DBSCAN_PKEY);
    }

    @Override
    public List<ForeignKey<DbscanRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DbscanRecord, ?>>asList(Keys.DBSCAN__DBSCAN_DIMENSION_FKEY1, Keys.DBSCAN__DBSCAN_SERVER_ID_FKEY1, Keys.DBSCAN__DBSCAN_CLUSTER_PARENT_FKEY1);
    }

    public Dimensions dimensions() {
        return new Dimensions(this, Keys.DBSCAN__DBSCAN_DIMENSION_FKEY1);
    }

    public Servers servers() {
        return new Servers(this, Keys.DBSCAN__DBSCAN_SERVER_ID_FKEY1);
    }

    public Dbscan dbscan() {
        return new Dbscan(this, Keys.DBSCAN__DBSCAN_CLUSTER_PARENT_FKEY1);
    }

    @Override
    public Dbscan as(String alias) {
        return new Dbscan(DSL.name(alias), this);
    }

    @Override
    public Dbscan as(Name alias) {
        return new Dbscan(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Dbscan rename(String name) {
        return new Dbscan(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Dbscan rename(Name name) {
        return new Dbscan(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<Integer, Integer, Integer, Short, Short, Boolean, Boolean, Integer, Integer, Integer, Long, Object[], Long, Long> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}
