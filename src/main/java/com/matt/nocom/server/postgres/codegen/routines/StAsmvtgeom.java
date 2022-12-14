/*
 * This file is generated by jOOQ.
 */
package com.matt.nocom.server.postgres.codegen.routines;


import com.matt.nocom.server.postgres.codegen.DefaultSchema;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;



/**
 * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
 */
@java.lang.Deprecated
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StAsmvtgeom extends AbstractRoutine<Object> {

    private static final long serialVersionUID = -1109171074;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> GEOM = Internal.createParameter("geom", org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> BOUNDS = Internal.createParameter("bounds", org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"box2d\""), false, false);

    /**
     * The parameter <code>st_asmvtgeom.extent</code>.
     */
    public static final Parameter<Integer> EXTENT = Internal.createParameter("extent", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("4096", org.jooq.impl.SQLDataType.INTEGER)), true, false);

    /**
     * The parameter <code>st_asmvtgeom.buffer</code>.
     */
    public static final Parameter<Integer> BUFFER = Internal.createParameter("buffer", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("256", org.jooq.impl.SQLDataType.INTEGER)), true, false);

    /**
     * The parameter <code>st_asmvtgeom.clip_geom</code>.
     */
    public static final Parameter<Boolean> CLIP_GEOM = Internal.createParameter("clip_geom", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * Create a new routine call instance
     */
    public StAsmvtgeom() {
        super("st_asmvtgeom", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""));

        setReturnParameter(RETURN_VALUE);
        addInParameter(GEOM);
        addInParameter(BOUNDS);
        addInParameter(EXTENT);
        addInParameter(BUFFER);
        addInParameter(CLIP_GEOM);
    }

    /**
     * Set the <code>geom</code> parameter IN value to the routine
     */
    public void setGeom(Object value) {
        setValue(GEOM, value);
    }

    /**
     * Set the <code>geom</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setGeom(Field<Object> field) {
        setField(GEOM, field);
    }

    /**
     * Set the <code>bounds</code> parameter IN value to the routine
     */
    public void setBounds(Object value) {
        setValue(BOUNDS, value);
    }

    /**
     * Set the <code>bounds</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setBounds(Field<Object> field) {
        setField(BOUNDS, field);
    }

    /**
     * Set the <code>extent</code> parameter IN value to the routine
     */
    public void setExtent(Integer value) {
        setValue(EXTENT, value);
    }

    /**
     * Set the <code>extent</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setExtent(Field<Integer> field) {
        setField(EXTENT, field);
    }

    /**
     * Set the <code>buffer</code> parameter IN value to the routine
     */
    public void setBuffer(Integer value) {
        setValue(BUFFER, value);
    }

    /**
     * Set the <code>buffer</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setBuffer(Field<Integer> field) {
        setField(BUFFER, field);
    }

    /**
     * Set the <code>clip_geom</code> parameter IN value to the routine
     */
    public void setClipGeom(Boolean value) {
        setValue(CLIP_GEOM, value);
    }

    /**
     * Set the <code>clip_geom</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setClipGeom(Field<Boolean> field) {
        setField(CLIP_GEOM, field);
    }
}
