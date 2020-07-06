/*
 * This file is generated by jOOQ.
 */
package com.matt.nocom.server.postgres.codegen.routines;


import com.matt.nocom.server.postgres.codegen.DefaultSchema;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PostgisLibjsonVersion extends AbstractRoutine<String> {

    private static final long serialVersionUID = -721639326;

    /**
     * The parameter <code>postgis_libjson_version.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public PostgisLibjsonVersion() {
        super("postgis_libjson_version", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
    }
}
