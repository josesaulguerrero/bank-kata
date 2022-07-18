package co.com.bank.entities;

import co.com.bank.domain.utils.UUIDGenerator;
import co.com.bank.interfaces.IIdGenerator;

public class Transaction {
    private static final IIdGenerator idGenerator = new UUIDGenerator();
    // -----------
    private final String id;
    private final Record record;

    public Transaction() {
        this.id = idGenerator.generate();
    }

    public String getId() {
        return id;
    }
}
