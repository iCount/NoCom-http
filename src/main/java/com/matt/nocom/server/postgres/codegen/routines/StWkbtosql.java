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
public class StWkbtosql extends AbstractRoutine<Object> {

    private static final long serialVersionUID = -427402499;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""), false, false);

    /**
     * The parameter <code>st_wkbtosql.wkb</code>.
     */
    public static final Parameter<byte[]> WKB = Internal.createParameter("wkb", org.jooq.impl.SQLDataType.BLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public StWkbtosql() {
        super("st_wkbtosql", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""));

        setReturnParameter(RETURN_VALUE);
        addInParameter(WKB);
    }

    /**
     * Set the <code>wkb</code> parameter IN value to the routine
     */
    public void setWkb(byte[] value) {
        setValue(WKB, value);
    }

    /**
     * Set the <code>wkb</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setWkb(Field<byte[]> field) {
        setField(WKB, field);
    }
}
