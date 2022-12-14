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
public class PostgisLiblwgeomVersion extends AbstractRoutine<String> {

    private static final long serialVersionUID = 1515060036;

    /**
     * The parameter <code>postgis_liblwgeom_version.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public PostgisLiblwgeomVersion() {
        super("postgis_liblwgeom_version", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
    }
}
