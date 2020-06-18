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
public class StExpand2 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = -909963558;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"box2d\""), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> BOX = Internal.createParameter("box", org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"box2d\""), false, false);

    /**
     * The parameter <code>st_expand.dx</code>.
     */
    public static final Parameter<Double> DX = Internal.createParameter("dx", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>st_expand.dy</code>.
     */
    public static final Parameter<Double> DY = Internal.createParameter("dy", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * Create a new routine call instance
     */
    public StExpand2() {
        super("st_expand", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"box2d\""));

        setReturnParameter(RETURN_VALUE);
        addInParameter(BOX);
        addInParameter(DX);
        addInParameter(DY);
        setOverloaded(true);
    }

    /**
     * Set the <code>box</code> parameter IN value to the routine
     */
    public void setBox(Object value) {
        setValue(BOX, value);
    }

    /**
     * Set the <code>box</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setBox(Field<Object> field) {
        setField(BOX, field);
    }

    /**
     * Set the <code>dx</code> parameter IN value to the routine
     */
    public void setDx(Double value) {
        setValue(DX, value);
    }

    /**
     * Set the <code>dx</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setDx(Field<Double> field) {
        setField(DX, field);
    }

    /**
     * Set the <code>dy</code> parameter IN value to the routine
     */
    public void setDy(Double value) {
        setValue(DY, value);
    }

    /**
     * Set the <code>dy</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setDy(Field<Double> field) {
        setField(DY, field);
    }
}
