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
public class PostgisConstraintSrid extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = -946793009;

    /**
     * The parameter <code>postgis_constraint_srid.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>postgis_constraint_srid.geomschema</code>.
     */
    public static final Parameter<String> GEOMSCHEMA = Internal.createParameter("geomschema", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>postgis_constraint_srid.geomtable</code>.
     */
    public static final Parameter<String> GEOMTABLE = Internal.createParameter("geomtable", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>postgis_constraint_srid.geomcolumn</code>.
     */
    public static final Parameter<String> GEOMCOLUMN = Internal.createParameter("geomcolumn", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public PostgisConstraintSrid() {
        super("postgis_constraint_srid", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(GEOMSCHEMA);
        addInParameter(GEOMTABLE);
        addInParameter(GEOMCOLUMN);
    }

    /**
     * Set the <code>geomschema</code> parameter IN value to the routine
     */
    public void setGeomschema(String value) {
        setValue(GEOMSCHEMA, value);
    }

    /**
     * Set the <code>geomschema</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setGeomschema(Field<String> field) {
        setField(GEOMSCHEMA, field);
    }

    /**
     * Set the <code>geomtable</code> parameter IN value to the routine
     */
    public void setGeomtable(String value) {
        setValue(GEOMTABLE, value);
    }

    /**
     * Set the <code>geomtable</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setGeomtable(Field<String> field) {
        setField(GEOMTABLE, field);
    }

    /**
     * Set the <code>geomcolumn</code> parameter IN value to the routine
     */
    public void setGeomcolumn(String value) {
        setValue(GEOMCOLUMN, value);
    }

    /**
     * Set the <code>geomcolumn</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setGeomcolumn(Field<String> field) {
        setField(GEOMCOLUMN, field);
    }
}
