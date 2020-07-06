/*
 * This file is generated by jOOQ.
 */
package com.matt.nocom.server.postgres.codegen.tables.records;


import com.matt.nocom.server.postgres.codegen.tables.DbscanToUpdate;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

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
public class DbscanToUpdateRecord extends UpdatableRecordImpl<DbscanToUpdateRecord> implements Record3<Integer, Long, Long> {

    private static final long serialVersionUID = 1585476222;

    /**
     * Setter for <code>dbscan_to_update.dbscan_id</code>.
     */
    public void setDbscanId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>dbscan_to_update.dbscan_id</code>.
     */
    public Integer getDbscanId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dbscan_to_update.updatable_lower</code>.
     */
    public void setUpdatableLower(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>dbscan_to_update.updatable_lower</code>.
     */
    public Long getUpdatableLower() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>dbscan_to_update.updatable_upper</code>.
     */
    public void setUpdatableUpper(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>dbscan_to_update.updatable_upper</code>.
     */
    public Long getUpdatableUpper() {
        return (Long) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Long, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return DbscanToUpdate.DBSCAN_TO_UPDATE.DBSCAN_ID;
    }

    @Override
    public Field<Long> field2() {
        return DbscanToUpdate.DBSCAN_TO_UPDATE.UPDATABLE_LOWER;
    }

    @Override
    public Field<Long> field3() {
        return DbscanToUpdate.DBSCAN_TO_UPDATE.UPDATABLE_UPPER;
    }

    @Override
    public Integer component1() {
        return getDbscanId();
    }

    @Override
    public Long component2() {
        return getUpdatableLower();
    }

    @Override
    public Long component3() {
        return getUpdatableUpper();
    }

    @Override
    public Integer value1() {
        return getDbscanId();
    }

    @Override
    public Long value2() {
        return getUpdatableLower();
    }

    @Override
    public Long value3() {
        return getUpdatableUpper();
    }

    @Override
    public DbscanToUpdateRecord value1(Integer value) {
        setDbscanId(value);
        return this;
    }

    @Override
    public DbscanToUpdateRecord value2(Long value) {
        setUpdatableLower(value);
        return this;
    }

    @Override
    public DbscanToUpdateRecord value3(Long value) {
        setUpdatableUpper(value);
        return this;
    }

    @Override
    public DbscanToUpdateRecord values(Integer value1, Long value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DbscanToUpdateRecord
     */
    public DbscanToUpdateRecord() {
        super(DbscanToUpdate.DBSCAN_TO_UPDATE);
    }

    /**
     * Create a detached, initialised DbscanToUpdateRecord
     */
    public DbscanToUpdateRecord(Integer dbscanId, Long updatableLower, Long updatableUpper) {
        super(DbscanToUpdate.DBSCAN_TO_UPDATE);

        set(0, dbscanId);
        set(1, updatableLower);
        set(2, updatableUpper);
    }
}