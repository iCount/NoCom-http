/*
 * This file is generated by jOOQ.
 */
package com.matt.nocom.server.postgres.codegen;


import org.jooq.Schema;
import org.jooq.impl.CatalogImpl;

import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultCatalog extends CatalogImpl {

    private static final long serialVersionUID = 875739907;

    /**
     * The reference instance of <code>DEFAULT_CATALOG</code>
     */
    public static final DefaultCatalog DEFAULT_CATALOG = new DefaultCatalog();

    /**
     * The schema <code>DEFAULT_SCHEMA</code>.
     */
    public final DefaultSchema DEFAULT_SCHEMA = DefaultSchema.DEFAULT_SCHEMA;

    /**
     * No further instances allowed
     */
    private DefaultCatalog() {
        super("");
    }

    @Override
    public final List<Schema> getSchemas() {
        return Arrays.<Schema>asList(
            DefaultSchema.DEFAULT_SCHEMA);
    }
}
