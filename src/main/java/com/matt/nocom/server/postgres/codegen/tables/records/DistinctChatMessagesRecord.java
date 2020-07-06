/*
 * This file is generated by jOOQ.
 */
package com.matt.nocom.server.postgres.codegen.tables.records;


import com.matt.nocom.server.postgres.codegen.tables.DistinctChatMessages;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DistinctChatMessagesRecord extends TableRecordImpl<DistinctChatMessagesRecord> implements Record1<String> {

    private static final long serialVersionUID = 813728021;

    /**
     * Setter for <code>distinct_chat_messages.txt</code>.
     */
    public void setTxt(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>distinct_chat_messages.txt</code>.
     */
    public String getTxt() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return DistinctChatMessages.DISTINCT_CHAT_MESSAGES.TXT;
    }

    @Override
    public String component1() {
        return getTxt();
    }

    @Override
    public String value1() {
        return getTxt();
    }

    @Override
    public DistinctChatMessagesRecord value1(String value) {
        setTxt(value);
        return this;
    }

    @Override
    public DistinctChatMessagesRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DistinctChatMessagesRecord
     */
    public DistinctChatMessagesRecord() {
        super(DistinctChatMessages.DISTINCT_CHAT_MESSAGES);
    }

    /**
     * Create a detached, initialised DistinctChatMessagesRecord
     */
    public DistinctChatMessagesRecord(String txt) {
        super(DistinctChatMessages.DISTINCT_CHAT_MESSAGES);

        set(0, txt);
    }
}
