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
public class StLength2 extends AbstractRoutine<Double> {

    private static final long serialVersionUID = -308602715;

    /**
     * The parameter <code>st_length.RETURN_VALUE</code>.
     */
    public static final Parameter<Double> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> GEOG = Internal.createParameter("geog", org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geography\""), false, false);

    /**
     * The parameter <code>st_length.use_spheroid</code>.
     */
    public static final Parameter<Boolean> USE_SPHEROID = Internal.createParameter("use_spheroid", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * Create a new routine call instance
     */
    public StLength2() {
        super("st_length", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.DOUBLE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(GEOG);
        addInParameter(USE_SPHEROID);
        setOverloaded(true);
    }

    /**
     * Set the <code>geog</code> parameter IN value to the routine
     */
    public void setGeog(Object value) {
        setValue(GEOG, value);
    }

    /**
     * Set the <code>geog</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setGeog(Field<Object> field) {
        setField(GEOG, field);
    }

    /**
     * Set the <code>use_spheroid</code> parameter IN value to the routine
     */
    public void setUseSpheroid(Boolean value) {
        setValue(USE_SPHEROID, value);
    }

    /**
     * Set the <code>use_spheroid</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setUseSpheroid(Field<Boolean> field) {
        setField(USE_SPHEROID, field);
    }
}
