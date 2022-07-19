package co.com.bank.entities;

import co.com.bank.domain.valueObjects.Id;

public class Transaction {
    private final Id id;
    private final Record record;

    public Transaction(Record record) {
        this.id = new Id();
        this.record = record;
    }

    public Id getId() {
        return id;
    }

    public Record getRecord() {
        return record;
    }
}
