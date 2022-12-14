/*
 * This file is generated by jOOQ.
 */
package com.matt.nocom.server.postgres.codegen.tables.records;


import com.matt.nocom.server.postgres.codegen.tables.SpatialRefSys;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SpatialRefSysRecord extends UpdatableRecordImpl<SpatialRefSysRecord> implements Record5<Integer, String, Integer, String, String> {

    private static final long serialVersionUID = 1115686923;

    /**
     * Setter for <code>spatial_ref_sys.srid</code>.
     */
    public void setSrid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>spatial_ref_sys.srid</code>.
     */
    public Integer getSrid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>spatial_ref_sys.auth_name</code>.
     */
    public void setAuthName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>spatial_ref_sys.auth_name</code>.
     */
    public String getAuthName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>spatial_ref_sys.auth_srid</code>.
     */
    public void setAuthSrid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>spatial_ref_sys.auth_srid</code>.
     */
    public Integer getAuthSrid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>spatial_ref_sys.srtext</code>.
     */
    public void setSrtext(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>spatial_ref_sys.srtext</code>.
     */
    public String getSrtext() {
        return (String) get(3);
    }

    /**
     * Setter for <code>spatial_ref_sys.proj4text</code>.
     */
    public void setProj4text(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>spatial_ref_sys.proj4text</code>.
     */
    public String getProj4text() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, Integer, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, String, Integer, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return SpatialRefSys.SPATIAL_REF_SYS.SRID;
    }

    @Override
    public Field<String> field2() {
        return SpatialRefSys.SPATIAL_REF_SYS.AUTH_NAME;
    }

    @Override
    public Field<Integer> field3() {
        return SpatialRefSys.SPATIAL_REF_SYS.AUTH_SRID;
    }

    @Override
    public Field<String> field4() {
        return SpatialRefSys.SPATIAL_REF_SYS.SRTEXT;
    }

    @Override
    public Field<String> field5() {
        return SpatialRefSys.SPATIAL_REF_SYS.PROJ4TEXT;
    }

    @Override
    public Integer component1() {
        return getSrid();
    }

    @Override
    public String component2() {
        return getAuthName();
    }

    @Override
    public Integer component3() {
        return getAuthSrid();
    }

    @Override
    public String component4() {
        return getSrtext();
    }

    @Override
    public String component5() {
        return getProj4text();
    }

    @Override
    public Integer value1() {
        return getSrid();
    }

    @Override
    public String value2() {
        return getAuthName();
    }

    @Override
    public Integer value3() {
        return getAuthSrid();
    }

    @Override
    public String value4() {
        return getSrtext();
    }

    @Override
    public String value5() {
        return getProj4text();
    }

    @Override
    public SpatialRefSysRecord value1(Integer value) {
        setSrid(value);
        return this;
    }

    @Override
    public SpatialRefSysRecord value2(String value) {
        setAuthName(value);
        return this;
    }

    @Override
    public SpatialRefSysRecord value3(Integer value) {
        setAuthSrid(value);
        return this;
    }

    @Override
    public SpatialRefSysRecord value4(String value) {
        setSrtext(value);
        return this;
    }

    @Override
    public SpatialRefSysRecord value5(String value) {
        setProj4text(value);
        return this;
    }

    @Override
    public SpatialRefSysRecord values(Integer value1, String value2, Integer value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SpatialRefSysRecord
     */
    public SpatialRefSysRecord() {
        super(SpatialRefSys.SPATIAL_REF_SYS);
    }

    /**
     * Create a detached, initialised SpatialRefSysRecord
     */
    public SpatialRefSysRecord(Integer srid, String authName, Integer authSrid, String srtext, String proj4text) {
        super(SpatialRefSys.SPATIAL_REF_SYS);

        set(0, srid);
        set(1, authName);
        set(2, authSrid);
        set(3, srtext);
        set(4, proj4text);
    }
}
