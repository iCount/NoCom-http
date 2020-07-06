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
public class StAskml2 extends AbstractRoutine<String> {

    private static final long serialVersionUID = -368104529;

    /**
     * The parameter <code>st_askml.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> GEOG = Internal.createParameter("geog", org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geography\""), false, false);

    /**
     * The parameter <code>st_askml.maxdecimaldigits</code>.
     */
    public static final Parameter<Integer> MAXDECIMALDIGITS = Internal.createParameter("maxdecimaldigits", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("15", org.jooq.impl.SQLDataType.INTEGER)), true, false);

    /**
     * The parameter <code>st_askml.nprefix</code>.
     */
    public static final Parameter<String> NPREFIX = Internal.createParameter("nprefix", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("''::text", org.jooq.impl.SQLDataType.CLOB)), true, false);

    /**
     * Create a new routine call instance
     */
    public StAskml2() {
        super("st_askml", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(GEOG);
        addInParameter(MAXDECIMALDIGITS);
        addInParameter(NPREFIX);
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
     * Set the <code>maxdecimaldigits</code> parameter IN value to the routine
     */
    public void setMaxdecimaldigits(Integer value) {
        setValue(MAXDECIMALDIGITS, value);
    }

    /**
     * Set the <code>maxdecimaldigits</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setMaxdecimaldigits(Field<Integer> field) {
        setField(MAXDECIMALDIGITS, field);
    }

    /**
     * Set the <code>nprefix</code> parameter IN value to the routine
     */
    public void setNprefix(String value) {
        setValue(NPREFIX, value);
    }

    /**
     * Set the <code>nprefix</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNprefix(Field<String> field) {
        setField(NPREFIX, field);
    }
}
