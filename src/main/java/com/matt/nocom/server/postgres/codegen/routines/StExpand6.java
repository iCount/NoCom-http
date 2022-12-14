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
public class StExpand6 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 526698311;

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
     * The parameter <code>st_expand.dx</code>.
     */
    public static final Parameter<Double> DX = Internal.createParameter("dx", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>st_expand.dy</code>.
     */
    public static final Parameter<Double> DY = Internal.createParameter("dy", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>st_expand.dz</code>.
     */
    public static final Parameter<Double> DZ = Internal.createParameter("dz", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.DOUBLE)), true, false);

    /**
     * The parameter <code>st_expand.dm</code>.
     */
    public static final Parameter<Double> DM = Internal.createParameter("dm", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.DOUBLE)), true, false);

    /**
     * Create a new routine call instance
     */
    public StExpand6() {
        super("st_expand", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""));

        setReturnParameter(RETURN_VALUE);
        addInParameter(GEOM);
        addInParameter(DX);
        addInParameter(DY);
        addInParameter(DZ);
        addInParameter(DM);
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

    /**
     * Set the <code>dz</code> parameter IN value to the routine
     */
    public void setDz(Double value) {
        setValue(DZ, value);
    }

    /**
     * Set the <code>dz</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setDz(Field<Double> field) {
        setField(DZ, field);
    }

    /**
     * Set the <code>dm</code> parameter IN value to the routine
     */
    public void setDm(Double value) {
        setValue(DM, value);
    }

    /**
     * Set the <code>dm</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setDm(Field<Double> field) {
        setField(DM, field);
    }
}
