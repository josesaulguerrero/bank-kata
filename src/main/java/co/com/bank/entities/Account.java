package co.com.bank.entities;

import co.com.bank.domain.utils.UUIDGenerator;
import co.com.bank.domain.valueObjects.Balance;
import co.com.bank.domain.valueObjects.Money;
import co.com.bank.interfaces.IIdGenerator;

public class Account {
    private static final IIdGenerator idGenerator = new UUIDGenerator();
    // -----------
    private final String id;
    private final Holder holder;
    private final Statement statement;
    private final Balance balance;

    public Account(Holder holder, Statement statement) {
        this.id = idGenerator.generate();
        this.holder = holder;
        this.statement = statement;
        this.balance = new Balance();
    }

    public String getId() {
        return id;
    }

    public Holder getHolder() {
        return holder;
    }

    public Balance getBalance() {
        return balance;
    }
}
