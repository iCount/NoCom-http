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
public class StLocatealong extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 624673038;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> GEOMETRY = Internal.createParameter("geometry", org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""), false, false);

    /**
     * The parameter <code>st_locatealong.measure</code>.
     */
    public static final Parameter<Double> MEASURE = Internal.createParameter("measure", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>st_locatealong.leftrightoffset</code>.
     */
    public static final Parameter<Double> LEFTRIGHTOFFSET = Internal.createParameter("leftrightoffset", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("0.0", org.jooq.impl.SQLDataType.DOUBLE)), true, false);

    /**
     * Create a new routine call instance
     */
    public StLocatealong() {
        super("st_locatealong", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""));

        setReturnParameter(RETURN_VALUE);
        addInParameter(GEOMETRY);
        addInParameter(MEASURE);
        addInParameter(LEFTRIGHTOFFSET);
    }

    /**
     * Set the <code>geometry</code> parameter IN value to the routine
     */
    public void setGeometry(Object value) {
        setValue(GEOMETRY, value);
    }

    /**
     * Set the <code>geometry</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setGeometry(Field<Object> field) {
        setField(GEOMETRY, field);
    }

    /**
     * Set the <code>measure</code> parameter IN value to the routine
     */
    public void setMeasure(Double value) {
        setValue(MEASURE, value);
    }

    /**
     * Set the <code>measure</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setMeasure(Field<Double> field) {
        setField(MEASURE, field);
    }

    /**
     * Set the <code>leftrightoffset</code> parameter IN value to the routine
     */
    public void setLeftrightoffset(Double value) {
        setValue(LEFTRIGHTOFFSET, value);
    }

    /**
     * Set the <code>leftrightoffset</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setLeftrightoffset(Field<Double> field) {
        setField(LEFTRIGHTOFFSET, field);
    }
}
