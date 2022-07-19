package co.com.bank.entities;

import co.com.bank.domain.utils.UUIDGenerator;
import co.com.bank.interfaces.IIdGenerator;

public class Transaction {
    private static final IIdGenerator idGenerator = new UUIDGenerator();
    // -----------
    private final String id;
    private final Record record;

    public Transaction(Record record) {
        this.id = idGenerator.generate();
        this.record = record;
    }

    public String getId() {
        return id;
    }

    public Record getRecord() {
        return record;
    }
}
