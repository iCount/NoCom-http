/*
 * This file is generated by jOOQ.
 */
package com.matt.nocom.server.postgres.codegen.tables.records;


import com.matt.nocom.server.postgres.codegen.tables.Test;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestRecord extends TableRecordImpl<TestRecord> implements Record2<Integer, Long> {

    private static final long serialVersionUID = -97933785;

    /**
     * Setter for <code>test.column1</code>.
     */
    public void setColumn1(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>test.column1</code>.
     */
    public Integer getColumn1() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>test.created_at</code>.
     */
    public void setCreatedAt(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>test.created_at</code>.
     */
    public Long getCreatedAt() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Test.TEST.COLUMN1;
    }

    @Override
    public Field<Long> field2() {
        return Test.TEST.CREATED_AT;
    }

    @Override
    public Integer component1() {
        return getColumn1();
    }

    @Override
    public Long component2() {
        return getCreatedAt();
    }

    @Override
    public Integer value1() {
        return getColumn1();
    }

    @Override
    public Long value2() {
        return getCreatedAt();
    }

    @Override
    public TestRecord value1(Integer value) {
        setColumn1(value);
        return this;
    }

    @Override
    public TestRecord value2(Long value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public TestRecord values(Integer value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TestRecord
     */
    public TestRecord() {
        super(Test.TEST);
    }

    /**
     * Create a detached, initialised TestRecord
     */
    public TestRecord(Integer column1, Long createdAt) {
        super(Test.TEST);

        set(0, column1);
        set(1, createdAt);
    }
}
