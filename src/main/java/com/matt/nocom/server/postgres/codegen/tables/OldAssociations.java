/*
 * This file is generated by jOOQ.
 */
package com.matt.nocom.server.postgres.codegen.tables;


import com.matt.nocom.server.postgres.codegen.DefaultSchema;
import com.matt.nocom.server.postgres.codegen.Indexes;
import com.matt.nocom.server.postgres.codegen.Keys;
import com.matt.nocom.server.postgres.codegen.tables.records.OldAssociationsRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OldAssociations extends TableImpl<OldAssociationsRecord> {

    private static final long serialVersionUID = 739122846;

    /**
     * The reference instance of <code>old_associations</code>
     */
    public static final OldAssociations OLD_ASSOCIATIONS = new OldAssociations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OldAssociationsRecord> getRecordType() {
        return OldAssociationsRecord.class;
    }

    /**
     * The column <code>old_associations.cluster_id</code>.
     */
    public final TableField<OldAssociationsRecord, Integer> CLUSTER_ID = createField(DSL.name("cluster_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>old_associations.player_id</code>.
     */
    public final TableField<OldAssociationsRecord, Integer> PLAYER_ID = createField(DSL.name("player_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>old_associations.association</code>.
     */
    public final TableField<OldAssociationsRecord, Double> ASSOCIATION = createField(DSL.name("association"), org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>old_associations.created_at</code>.
     */
    public final TableField<OldAssociationsRecord, Long> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>old_associations</code> table reference
     */
    public OldAssociations() {
        this(DSL.name("old_associations"), null);
    }

    /**
     * Create an aliased <code>old_associations</code> table reference
     */
    public OldAssociations(String alias) {
        this(DSL.name(alias), OLD_ASSOCIATIONS);
    }

    /**
     * Create an aliased <code>old_associations</code> table reference
     */
    public OldAssociations(Name alias) {
        this(alias, OLD_ASSOCIATIONS);
    }

    private OldAssociations(Name alias, Table<OldAssociationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private OldAssociations(Name alias, Table<OldAssociationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> OldAssociations(Table<O> child, ForeignKey<O, OldAssociationsRecord> key) {
        super(child, key, OLD_ASSOCIATIONS);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.OLD_ASSOCIATIONS_CLUSTER_ID, Indexes.OLD_ASSOCIATIONS_PLAYER_AND_CLUSTER, Indexes.OLD_ASSOCIATIONS_PLAYER_ID);
    }

    @Override
    public List<ForeignKey<OldAssociationsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<OldAssociationsRecord, ?>>asList(Keys.OLD_ASSOCIATIONS__ASSOCIATIONS_CLUSTER_ID_FKEY, Keys.OLD_ASSOCIATIONS__ASSOCIATIONS_PLAYER_ID_FKEY);
    }

    public OldDbscan oldDbscan() {
        return new OldDbscan(this, Keys.OLD_ASSOCIATIONS__ASSOCIATIONS_CLUSTER_ID_FKEY);
    }

    public Players players() {
        return new Players(this, Keys.OLD_ASSOCIATIONS__ASSOCIATIONS_PLAYER_ID_FKEY);
    }

    @Override
    public OldAssociations as(String alias) {
        return new OldAssociations(DSL.name(alias), this);
    }

    @Override
    public OldAssociations as(Name alias) {
        return new OldAssociations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OldAssociations rename(String name) {
        return new OldAssociations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OldAssociations rename(Name name) {
        return new OldAssociations(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, Double, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
