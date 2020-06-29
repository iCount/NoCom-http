/*
 * This file is generated by jOOQ.
 */
package com.matt.nocom.server.postgres.codegen.routines;


import com.matt.nocom.server.postgres.codegen.DefaultSchema;
import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;

import javax.annotation.processing.Generated;



/**
 * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
 */
@java.lang.Deprecated
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StBuffer1 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 464906510;

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
     * The parameter <code>st_buffer.radius</code>.
     */
    public static final Parameter<Double> RADIUS = Internal.createParameter("radius", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>st_buffer.options</code>.
     */
    public static final Parameter<String> OPTIONS = Internal.createParameter("options", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("''::text", org.jooq.impl.SQLDataType.CLOB)), true, false);

    /**
     * Create a new routine call instance
     */
    public StBuffer1() {
        super("st_buffer", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""));

        setReturnParameter(RETURN_VALUE);
        addInParameter(GEOM);
        addInParameter(RADIUS);
        addInParameter(OPTIONS);
        setOverloaded(true);
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
     * Set the <code>radius</code> parameter IN value to the routine
     */
    public void setRadius(Double value) {
        setValue(RADIUS, value);
    }

    /**
     * Set the <code>radius</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setRadius(Field<Double> field) {
        setField(RADIUS, field);
    }

    /**
     * Set the <code>options</code> parameter IN value to the routine
     */
    public void setOptions(String value) {
        setValue(OPTIONS, value);
    }

    /**
     * Set the <code>options</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setOptions(Field<String> field) {
        setField(OPTIONS, field);
    }
}