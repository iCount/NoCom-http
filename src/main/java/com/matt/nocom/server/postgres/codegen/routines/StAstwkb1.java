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
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StAstwkb1 extends AbstractRoutine<byte[]> {

    private static final long serialVersionUID = 89166863;

    /**
     * The parameter <code>st_astwkb.RETURN_VALUE</code>.
     */
    public static final Parameter<byte[]> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BLOB, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> GEOM = Internal.createParameter("geom", org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""), false, false);

    /**
     * The parameter <code>st_astwkb.prec</code>.
     */
    public static final Parameter<Integer> PREC = Internal.createParameter("prec", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL::integer", org.jooq.impl.SQLDataType.INTEGER)), true, false);

    /**
     * The parameter <code>st_astwkb.prec_z</code>.
     */
    public static final Parameter<Integer> PREC_Z = Internal.createParameter("prec_z", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL::integer", org.jooq.impl.SQLDataType.INTEGER)), true, false);

    /**
     * The parameter <code>st_astwkb.prec_m</code>.
     */
    public static final Parameter<Integer> PREC_M = Internal.createParameter("prec_m", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL::integer", org.jooq.impl.SQLDataType.INTEGER)), true, false);

    /**
     * The parameter <code>st_astwkb.with_sizes</code>.
     */
    public static final Parameter<Boolean> WITH_SIZES = Internal.createParameter("with_sizes", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("NULL::boolean", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * The parameter <code>st_astwkb.with_boxes</code>.
     */
    public static final Parameter<Boolean> WITH_BOXES = Internal.createParameter("with_boxes", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("NULL::boolean", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * Create a new routine call instance
     */
    public StAstwkb1() {
        super("st_astwkb", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(GEOM);
        addInParameter(PREC);
        addInParameter(PREC_Z);
        addInParameter(PREC_M);
        addInParameter(WITH_SIZES);
        addInParameter(WITH_BOXES);
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
     * Set the <code>prec</code> parameter IN value to the routine
     */
    public void setPrec(Integer value) {
        setValue(PREC, value);
    }

    /**
     * Set the <code>prec</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setPrec(Field<Integer> field) {
        setField(PREC, field);
    }

    /**
     * Set the <code>prec_z</code> parameter IN value to the routine
     */
    public void setPrecZ(Integer value) {
        setValue(PREC_Z, value);
    }

    /**
     * Set the <code>prec_z</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setPrecZ(Field<Integer> field) {
        setField(PREC_Z, field);
    }

    /**
     * Set the <code>prec_m</code> parameter IN value to the routine
     */
    public void setPrecM(Integer value) {
        setValue(PREC_M, value);
    }

    /**
     * Set the <code>prec_m</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setPrecM(Field<Integer> field) {
        setField(PREC_M, field);
    }

    /**
     * Set the <code>with_sizes</code> parameter IN value to the routine
     */
    public void setWithSizes(Boolean value) {
        setValue(WITH_SIZES, value);
    }

    /**
     * Set the <code>with_sizes</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setWithSizes(Field<Boolean> field) {
        setField(WITH_SIZES, field);
    }

    /**
     * Set the <code>with_boxes</code> parameter IN value to the routine
     */
    public void setWithBoxes(Boolean value) {
        setValue(WITH_BOXES, value);
    }

    /**
     * Set the <code>with_boxes</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setWithBoxes(Field<Boolean> field) {
        setField(WITH_BOXES, field);
    }
}
