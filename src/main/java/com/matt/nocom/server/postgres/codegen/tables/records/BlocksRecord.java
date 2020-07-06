/*
 * This file is generated by jOOQ.
 */
package com.matt.nocom.server.postgres.codegen.tables.records;


import com.matt.nocom.server.postgres.codegen.tables.Blocks;
import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BlocksRecord extends TableRecordImpl<BlocksRecord> implements Record7<Integer, Short, Integer, Integer, Long, Short, Short> {

    private static final long serialVersionUID = 2119943814;

    /**
     * Setter for <code>blocks.x</code>.
     */
    public void setX(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>blocks.x</code>.
     */
    public Integer getX() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>blocks.y</code>.
     */
    public void setY(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>blocks.y</code>.
     */
    public Short getY() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>blocks.z</code>.
     */
    public void setZ(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>blocks.z</code>.
     */
    public Integer getZ() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>blocks.block_state</code>.
     */
    public void setBlockState(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>blocks.block_state</code>.
     */
    public Integer getBlockState() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>blocks.created_at</code>.
     */
    public void setCreatedAt(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>blocks.created_at</code>.
     */
    public Long getCreatedAt() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>blocks.dimension</code>.
     */
    public void setDimension(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>blocks.dimension</code>.
     */
    public Short getDimension() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>blocks.server_id</code>.
     */
    public void setServerId(Short value) {
        set(6, value);
    }

    /**
     * Getter for <code>blocks.server_id</code>.
     */
    public Short getServerId() {
        return (Short) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Short, Integer, Integer, Long, Short, Short> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, Short, Integer, Integer, Long, Short, Short> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Blocks.BLOCKS.X;
    }

    @Override
    public Field<Short> field2() {
        return Blocks.BLOCKS.Y;
    }

    @Override
    public Field<Integer> field3() {
        return Blocks.BLOCKS.Z;
    }

    @Override
    public Field<Integer> field4() {
        return Blocks.BLOCKS.BLOCK_STATE;
    }

    @Override
    public Field<Long> field5() {
        return Blocks.BLOCKS.CREATED_AT;
    }

    @Override
    public Field<Short> field6() {
        return Blocks.BLOCKS.DIMENSION;
    }

    @Override
    public Field<Short> field7() {
        return Blocks.BLOCKS.SERVER_ID;
    }

    @Override
    public Integer component1() {
        return getX();
    }

    @Override
    public Short component2() {
        return getY();
    }

    @Override
    public Integer component3() {
        return getZ();
    }

    @Override
    public Integer component4() {
        return getBlockState();
    }

    @Override
    public Long component5() {
        return getCreatedAt();
    }

    @Override
    public Short component6() {
        return getDimension();
    }

    @Override
    public Short component7() {
        return getServerId();
    }

    @Override
    public Integer value1() {
        return getX();
    }

    @Override
    public Short value2() {
        return getY();
    }

    @Override
    public Integer value3() {
        return getZ();
    }

    @Override
    public Integer value4() {
        return getBlockState();
    }

    @Override
    public Long value5() {
        return getCreatedAt();
    }

    @Override
    public Short value6() {
        return getDimension();
    }

    @Override
    public Short value7() {
        return getServerId();
    }

    @Override
    public BlocksRecord value1(Integer value) {
        setX(value);
        return this;
    }

    @Override
    public BlocksRecord value2(Short value) {
        setY(value);
        return this;
    }

    @Override
    public BlocksRecord value3(Integer value) {
        setZ(value);
        return this;
    }

    @Override
    public BlocksRecord value4(Integer value) {
        setBlockState(value);
        return this;
    }

    @Override
    public BlocksRecord value5(Long value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public BlocksRecord value6(Short value) {
        setDimension(value);
        return this;
    }

    @Override
    public BlocksRecord value7(Short value) {
        setServerId(value);
        return this;
    }

    @Override
    public BlocksRecord values(Integer value1, Short value2, Integer value3, Integer value4, Long value5, Short value6, Short value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BlocksRecord
     */
    public BlocksRecord() {
        super(Blocks.BLOCKS);
    }

    /**
     * Create a detached, initialised BlocksRecord
     */
    public BlocksRecord(Integer x, Short y, Integer z, Integer blockState, Long createdAt, Short dimension, Short serverId) {
        super(Blocks.BLOCKS);

        set(0, x);
        set(1, y);
        set(2, z);
        set(3, blockState);
        set(4, createdAt);
        set(5, dimension);
        set(6, serverId);
    }
}
