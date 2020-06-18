/*
 * This file is generated by jOOQ.
 */
package com.matt.nocom.server.postgres.codegen.tables;


import com.matt.nocom.server.postgres.codegen.DefaultSchema;
import com.matt.nocom.server.postgres.codegen.tables.records.StSubdivideRecord;
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
public class StSubdivide extends TableImpl<StSubdivideRecord> {

    private static final long serialVersionUID = -1169099579;

    /**
     * The reference instance of <code>st_subdivide</code>
     */
    public static final StSubdivide ST_SUBDIVIDE = new StSubdivide();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StSubdivideRecord> getRecordType() {
        return StSubdivideRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<StSubdivideRecord, Object> ST_SUBDIVIDE_ = createField(DSL.name("st_subdivide"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"geometry\""), this, "");

    /**
     * Create a <code>st_subdivide</code> table reference
     */
    public StSubdivide() {
        this(DSL.name("st_subdivide"), null);
    }

    /**
     * Create an aliased <code>st_subdivide</code> table reference
     */
    public StSubdivide(String alias) {
        this(DSL.name(alias), ST_SUBDIVIDE);
    }

    /**
     * Create an aliased <code>st_subdivide</code> table reference
     */
    public StSubdivide(Name alias) {
        this(alias, ST_SUBDIVIDE);
    }

    private StSubdivide(Name alias, Table<StSubdivideRecord> aliased) {
        this(alias, aliased, new Field[2]);
    }

    private StSubdivide(Name alias, Table<StSubdivideRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> StSubdivide(Table<O> child, ForeignKey<O, StSubdivideRecord> key) {
        super(child, key, ST_SUBDIVIDE);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public StSubdivide as(String alias) {
        return new StSubdivide(DSL.name(alias), this, parameters);
    }

    @Override
    public StSubdivide as(Name alias) {
        return new StSubdivide(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StSubdivide rename(String name) {
        return new StSubdivide(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StSubdivide rename(Name name) {
        return new StSubdivide(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<Object> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public StSubdivide call(Object geom, Integer maxvertices) {
        return new StSubdivide(DSL.name(getName()), null, new Field[] { 
              DSL.val(geom, org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""))
            , DSL.val(maxvertices, org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("256", org.jooq.impl.SQLDataType.INTEGER)))
        });
    }

    /**
     * Call this table-valued function
     */
    public StSubdivide call(Field<Object> geom, Field<Integer> maxvertices) {
        return new StSubdivide(DSL.name(getName()), null, new Field[] { 
              geom
            , maxvertices
        });
    }
}
