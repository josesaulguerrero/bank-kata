package co.com.bank.entities;

import co.com.bank.domain.utils.UUIDGenerator;
import co.com.bank.domain.valueObjects.Balance;
import co.com.bank.interfaces.ICheckingAccountOperations;
import co.com.bank.interfaces.IIdGenerator;

public class CheckingAccount implements ICheckingAccountOperations {
    private static final IIdGenerator idGenerator = new UUIDGenerator();
    // -----------
    private final String id;
    private final Holder holder;
    private final Statement statement;
    private final Balance balance;

    public CheckingAccount(Holder holder, Statement statement) {
        this.id = idGenerator.generate();
        this.holder = holder;
        this.statement = statement;
        this.balance = new Balance();
    }

    @Override
    public void withdraw() {

    }

    @Override
    public void deposit() {

    }

    @Override
    public void transfer() {

    }

    @Override
    public void getStatement() {

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
