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
public class StAffine1 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 822797932;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> _1 = Internal.createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""), false, true);

    /**
     * The parameter <code>st_affine._2</code>.
     */
    public static final Parameter<Double> _2 = Internal.createParameter("_2", org.jooq.impl.SQLDataType.DOUBLE, false, true);

    /**
     * The parameter <code>st_affine._3</code>.
     */
    public static final Parameter<Double> _3 = Internal.createParameter("_3", org.jooq.impl.SQLDataType.DOUBLE, false, true);

    /**
     * The parameter <code>st_affine._4</code>.
     */
    public static final Parameter<Double> _4 = Internal.createParameter("_4", org.jooq.impl.SQLDataType.DOUBLE, false, true);

    /**
     * The parameter <code>st_affine._5</code>.
     */
    public static final Parameter<Double> _5 = Internal.createParameter("_5", org.jooq.impl.SQLDataType.DOUBLE, false, true);

    /**
     * The parameter <code>st_affine._6</code>.
     */
    public static final Parameter<Double> _6 = Internal.createParameter("_6", org.jooq.impl.SQLDataType.DOUBLE, false, true);

    /**
     * The parameter <code>st_affine._7</code>.
     */
    public static final Parameter<Double> _7 = Internal.createParameter("_7", org.jooq.impl.SQLDataType.DOUBLE, false, true);

    /**
     * The parameter <code>st_affine._8</code>.
     */
    public static final Parameter<Double> _8 = Internal.createParameter("_8", org.jooq.impl.SQLDataType.DOUBLE, false, true);

    /**
     * The parameter <code>st_affine._9</code>.
     */
    public static final Parameter<Double> _9 = Internal.createParameter("_9", org.jooq.impl.SQLDataType.DOUBLE, false, true);

    /**
     * The parameter <code>st_affine._10</code>.
     */
    public static final Parameter<Double> _10 = Internal.createParameter("_10", org.jooq.impl.SQLDataType.DOUBLE, false, true);

    /**
     * The parameter <code>st_affine._11</code>.
     */
    public static final Parameter<Double> _11 = Internal.createParameter("_11", org.jooq.impl.SQLDataType.DOUBLE, false, true);

    /**
     * The parameter <code>st_affine._12</code>.
     */
    public static final Parameter<Double> _12 = Internal.createParameter("_12", org.jooq.impl.SQLDataType.DOUBLE, false, true);

    /**
     * The parameter <code>st_affine._13</code>.
     */
    public static final Parameter<Double> _13 = Internal.createParameter("_13", org.jooq.impl.SQLDataType.DOUBLE, false, true);

    /**
     * Create a new routine call instance
     */
    public StAffine1() {
        super("st_affine", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        addInParameter(_4);
        addInParameter(_5);
        addInParameter(_6);
        addInParameter(_7);
        addInParameter(_8);
        addInParameter(_9);
        addInParameter(_10);
        addInParameter(_11);
        addInParameter(_12);
        addInParameter(_13);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Object value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Object> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Double value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Double> field) {
        setField(_2, field);
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    public void set__3(Double value) {
        setValue(_3, value);
    }

    /**
     * Set the <code>_3</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__3(Field<Double> field) {
        setField(_3, field);
    }

    /**
     * Set the <code>_4</code> parameter IN value to the routine
     */
    public void set__4(Double value) {
        setValue(_4, value);
    }

    /**
     * Set the <code>_4</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__4(Field<Double> field) {
        setField(_4, field);
    }

    /**
     * Set the <code>_5</code> parameter IN value to the routine
     */
    public void set__5(Double value) {
        setValue(_5, value);
    }

    /**
     * Set the <code>_5</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__5(Field<Double> field) {
        setField(_5, field);
    }

    /**
     * Set the <code>_6</code> parameter IN value to the routine
     */
    public void set__6(Double value) {
        setValue(_6, value);
    }

    /**
     * Set the <code>_6</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__6(Field<Double> field) {
        setField(_6, field);
    }

    /**
     * Set the <code>_7</code> parameter IN value to the routine
     */
    public void set__7(Double value) {
        setValue(_7, value);
    }

    /**
     * Set the <code>_7</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__7(Field<Double> field) {
        setField(_7, field);
    }

    /**
     * Set the <code>_8</code> parameter IN value to the routine
     */
    public void set__8(Double value) {
        setValue(_8, value);
    }

    /**
     * Set the <code>_8</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__8(Field<Double> field) {
        setField(_8, field);
    }

    /**
     * Set the <code>_9</code> parameter IN value to the routine
     */
    public void set__9(Double value) {
        setValue(_9, value);
    }

    /**
     * Set the <code>_9</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__9(Field<Double> field) {
        setField(_9, field);
    }

    /**
     * Set the <code>_10</code> parameter IN value to the routine
     */
    public void set__10(Double value) {
        setValue(_10, value);
    }

    /**
     * Set the <code>_10</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__10(Field<Double> field) {
        setField(_10, field);
    }

    /**
     * Set the <code>_11</code> parameter IN value to the routine
     */
    public void set__11(Double value) {
        setValue(_11, value);
    }

    /**
     * Set the <code>_11</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__11(Field<Double> field) {
        setField(_11, field);
    }

    /**
     * Set the <code>_12</code> parameter IN value to the routine
     */
    public void set__12(Double value) {
        setValue(_12, value);
    }

    /**
     * Set the <code>_12</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__12(Field<Double> field) {
        setField(_12, field);
    }

    /**
     * Set the <code>_13</code> parameter IN value to the routine
     */
    public void set__13(Double value) {
        setValue(_13, value);
    }

    /**
     * Set the <code>_13</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__13(Field<Double> field) {
        setField(_13, field);
    }
}
