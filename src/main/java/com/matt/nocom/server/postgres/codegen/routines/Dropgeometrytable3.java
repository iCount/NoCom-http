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
public class Dropgeometrytable3 extends AbstractRoutine<String> {

    private static final long serialVersionUID = -461412664;

    /**
     * The parameter <code>dropgeometrytable.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>dropgeometrytable.table_name</code>.
     */
    public static final Parameter<String> TABLE_NAME = Internal.createParameter("table_name", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * Create a new routine call instance
     */
    public Dropgeometrytable3() {
        super("dropgeometrytable", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(TABLE_NAME);
        setOverloaded(true);
    }

    /**
     * Set the <code>table_name</code> parameter IN value to the routine
     */
    public void setTableName(String value) {
        setValue(TABLE_NAME, value);
    }

    /**
     * Set the <code>table_name</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setTableName(Field<String> field) {
        setField(TABLE_NAME, field);
    }
}
