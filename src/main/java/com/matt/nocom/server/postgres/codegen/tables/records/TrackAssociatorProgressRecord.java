/*
 * This file is generated by jOOQ.
 */
package com.matt.nocom.server.postgres.codegen.tables.records;


import com.matt.nocom.server.postgres.codegen.tables.TrackAssociatorProgress;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;

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
public class TrackAssociatorProgressRecord extends TableRecordImpl<TrackAssociatorProgressRecord> implements Record1<Long> {

    private static final long serialVersionUID = 1414375361;

    /**
     * Setter for <code>track_associator_progress.max_updated_at_processed</code>.
     */
    public void setMaxUpdatedAtProcessed(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>track_associator_progress.max_updated_at_processed</code>.
     */
    public Long getMaxUpdatedAtProcessed() {
        return (Long) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<Long> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<Long> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TrackAssociatorProgress.TRACK_ASSOCIATOR_PROGRESS.MAX_UPDATED_AT_PROCESSED;
    }

    @Override
    public Long component1() {
        return getMaxUpdatedAtProcessed();
    }

    @Override
    public Long value1() {
        return getMaxUpdatedAtProcessed();
    }

    @Override
    public TrackAssociatorProgressRecord value1(Long value) {
        setMaxUpdatedAtProcessed(value);
        return this;
    }

    @Override
    public TrackAssociatorProgressRecord values(Long value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TrackAssociatorProgressRecord
     */
    public TrackAssociatorProgressRecord() {
        super(TrackAssociatorProgress.TRACK_ASSOCIATOR_PROGRESS);
    }

    /**
     * Create a detached, initialised TrackAssociatorProgressRecord
     */
    public TrackAssociatorProgressRecord(Long maxUpdatedAtProcessed) {
        super(TrackAssociatorProgress.TRACK_ASSOCIATOR_PROGRESS);

        set(0, maxUpdatedAtProcessed);
    }
}
