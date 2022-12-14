/*
 * This file is generated by jOOQ.
 */
package com.matt.nocom.server.postgres.codegen.tables;


import com.matt.nocom.server.postgres.codegen.DefaultSchema;
import com.matt.nocom.server.postgres.codegen.Indexes;
import com.matt.nocom.server.postgres.codegen.Keys;
import com.matt.nocom.server.postgres.codegen.tables.records.BlocksRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Blocks extends TableImpl<BlocksRecord> {

    private static final long serialVersionUID = 1212777102;

    /**
     * The reference instance of <code>blocks</code>
     */
    public static final Blocks BLOCKS = new Blocks();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BlocksRecord> getRecordType() {
        return BlocksRecord.class;
    }

    /**
     * The column <code>blocks.x</code>.
     */
    public final TableField<BlocksRecord, Integer> X = createField(DSL.name("x"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>blocks.y</code>.
     */
    public final TableField<BlocksRecord, Short> Y = createField(DSL.name("y"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>blocks.z</code>.
     */
    public final TableField<BlocksRecord, Integer> Z = createField(DSL.name("z"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>blocks.block_state</code>.
     */
    public final TableField<BlocksRecord, Integer> BLOCK_STATE = createField(DSL.name("block_state"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>blocks.created_at</code>.
     */
    public final TableField<BlocksRecord, Long> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>blocks.dimension</code>.
     */
    public final TableField<BlocksRecord, Short> DIMENSION = createField(DSL.name("dimension"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>blocks.server_id</code>.
     */
    public final TableField<BlocksRecord, Short> SERVER_ID = createField(DSL.name("server_id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * Create a <code>blocks</code> table reference
     */
    public Blocks() {
        this(DSL.name("blocks"), null);
    }

    /**
     * Create an aliased <code>blocks</code> table reference
     */
    public Blocks(String alias) {
        this(DSL.name(alias), BLOCKS);
    }

    /**
     * Create an aliased <code>blocks</code> table reference
     */
    public Blocks(Name alias) {
        this(alias, BLOCKS);
    }

    private Blocks(Name alias, Table<BlocksRecord> aliased) {
        this(alias, aliased, null);
    }

    private Blocks(Name alias, Table<BlocksRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Blocks(Table<O> child, ForeignKey<O, BlocksRecord> key) {
        super(child, key, BLOCKS);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.BLOCKS_BY_LOC, Indexes.BLOCKS_BY_TIME);
    }

    @Override
    public List<ForeignKey<BlocksRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BlocksRecord, ?>>asList(Keys.BLOCKS__BLOCKS_DIMENSION_FKEY, Keys.BLOCKS__BLOCKS_SERVER_ID_FKEY);
    }

    public Dimensions dimensions() {
        return new Dimensions(this, Keys.BLOCKS__BLOCKS_DIMENSION_FKEY);
    }

    public Servers servers() {
        return new Servers(this, Keys.BLOCKS__BLOCKS_SERVER_ID_FKEY);
    }

    @Override
    public Blocks as(String alias) {
        return new Blocks(DSL.name(alias), this);
    }

    @Override
    public Blocks as(Name alias) {
        return new Blocks(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Blocks rename(String name) {
        return new Blocks(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Blocks rename(Name name) {
        return new Blocks(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Short, Integer, Integer, Long, Short, Short> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
