/*
 * This file is generated by jOOQ.
 */
package com.matt.nocom.server.postgres.codegen.tables;


import com.matt.nocom.server.postgres.codegen.DefaultSchema;
import com.matt.nocom.server.postgres.codegen.tables.records.AssocRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Assoc extends TableImpl<AssocRecord> {

    private static final long serialVersionUID = -2049121090;

    /**
     * The reference instance of <code>assoc</code>
     */
    public static final Assoc ASSOC = new Assoc();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AssocRecord> getRecordType() {
        return AssocRecord.class;
    }

    /**
     * The column <code>assoc.username</code>.
     */
    public final TableField<AssocRecord, String> USERNAME = createField(DSL.name("username"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>assoc.cluster_id</code>.
     */
    public final TableField<AssocRecord, Integer> CLUSTER_ID = createField(DSL.name("cluster_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>assoc.association</code>.
     */
    public final TableField<AssocRecord, Double> ASSOCIATION = createField(DSL.name("association"), org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * Create a <code>assoc</code> table reference
     */
    public Assoc() {
        this(DSL.name("assoc"), null);
    }

    /**
     * Create an aliased <code>assoc</code> table reference
     */
    public Assoc(String alias) {
        this(DSL.name(alias), ASSOC);
    }

    /**
     * Create an aliased <code>assoc</code> table reference
     */
    public Assoc(Name alias) {
        this(alias, ASSOC);
    }

    private Assoc(Name alias, Table<AssocRecord> aliased) {
        this(alias, aliased, null);
    }

    private Assoc(Name alias, Table<AssocRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"assoc\" as  SELECT players.username,\n    tmp.cluster_id,\n    tmp.association\n   FROM (( SELECT associations.cluster_id,\n            associations.player_id,\n            sum(associations.association) AS association\n           FROM associations\n          GROUP BY associations.player_id, associations.cluster_id) tmp\n     JOIN players ON ((players.id = tmp.player_id)));"));
    }

    public <O extends Record> Assoc(Table<O> child, ForeignKey<O, AssocRecord> key) {
        super(child, key, ASSOC);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public Assoc as(String alias) {
        return new Assoc(DSL.name(alias), this);
    }

    @Override
    public Assoc as(Name alias) {
        return new Assoc(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Assoc rename(String name) {
        return new Assoc(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Assoc rename(Name name) {
        return new Assoc(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, Integer, Double> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
