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
public class StAzimuth2 extends AbstractRoutine<Double> {

    private static final long serialVersionUID = 1155045256;

    /**
     * The parameter <code>st_azimuth.RETURN_VALUE</code>.
     */
    public static final Parameter<Double> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> GEOG1 = Internal.createParameter("geog1", org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geography\""), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> GEOG2 = Internal.createParameter("geog2", org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geography\""), false, false);

    /**
     * Create a new routine call instance
     */
    public StAzimuth2() {
        super("st_azimuth", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.DOUBLE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(GEOG1);
        addInParameter(GEOG2);
        setOverloaded(true);
    }

    /**
     * Set the <code>geog1</code> parameter IN value to the routine
     */
    public void setGeog1(Object value) {
        setValue(GEOG1, value);
    }

    /**
     * Set the <code>geog1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setGeog1(Field<Object> field) {
        setField(GEOG1, field);
    }

    /**
     * Set the <code>geog2</code> parameter IN value to the routine
     */
    public void setGeog2(Object value) {
        setValue(GEOG2, value);
    }

    /**
     * Set the <code>geog2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setGeog2(Field<Object> field) {
        setField(GEOG2, field);
    }
}