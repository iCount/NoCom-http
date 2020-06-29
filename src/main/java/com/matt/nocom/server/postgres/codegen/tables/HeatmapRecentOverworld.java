/*
 * This file is generated by jOOQ.
 */
package com.matt.nocom.server.postgres.codegen.tables;


import com.matt.nocom.server.postgres.codegen.DefaultSchema;
import com.matt.nocom.server.postgres.codegen.tables.records.HeatmapRecentOverworldRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.processing.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HeatmapRecentOverworld extends TableImpl<HeatmapRecentOverworldRecord> {

    private static final long serialVersionUID = -1059687982;

    /**
     * The reference instance of <code>heatmap_recent_overworld</code>
     */
    public static final HeatmapRecentOverworld HEATMAP_RECENT_OVERWORLD = new HeatmapRecentOverworld();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HeatmapRecentOverworldRecord> getRecordType() {
        return HeatmapRecentOverworldRecord.class;
    }

    /**
     * The column <code>heatmap_recent_overworld.x</code>.
     */
    public final TableField<HeatmapRecentOverworldRecord, Integer> X = createField(DSL.name("x"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>heatmap_recent_overworld.z</code>.
     */
    public final TableField<HeatmapRecentOverworldRecord, Integer> Z = createField(DSL.name("z"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>heatmap_recent_overworld.cnt</code>.
     */
    public final TableField<HeatmapRecentOverworldRecord, Long> CNT = createField(DSL.name("cnt"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>heatmap_recent_overworld</code> table reference
     */
    public HeatmapRecentOverworld() {
        this(DSL.name("heatmap_recent_overworld"), null);
    }

    /**
     * Create an aliased <code>heatmap_recent_overworld</code> table reference
     */
    public HeatmapRecentOverworld(String alias) {
        this(DSL.name(alias), HEATMAP_RECENT_OVERWORLD);
    }

    /**
     * Create an aliased <code>heatmap_recent_overworld</code> table reference
     */
    public HeatmapRecentOverworld(Name alias) {
        this(alias, HEATMAP_RECENT_OVERWORLD);
    }

    private HeatmapRecentOverworld(Name alias, Table<HeatmapRecentOverworldRecord> aliased) {
        this(alias, aliased, null);
    }

    private HeatmapRecentOverworld(Name alias, Table<HeatmapRecentOverworldRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> HeatmapRecentOverworld(Table<O> child, ForeignKey<O, HeatmapRecentOverworldRecord> key) {
        super(child, key, HEATMAP_RECENT_OVERWORLD);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public HeatmapRecentOverworld as(String alias) {
        return new HeatmapRecentOverworld(DSL.name(alias), this);
    }

    @Override
    public HeatmapRecentOverworld as(Name alias) {
        return new HeatmapRecentOverworld(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HeatmapRecentOverworld rename(String name) {
        return new HeatmapRecentOverworld(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HeatmapRecentOverworld rename(Name name) {
        return new HeatmapRecentOverworld(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}