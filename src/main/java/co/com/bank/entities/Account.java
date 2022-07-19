package co.com.bank.entities;

import co.com.bank.domain.valueObjects.Balance;
import co.com.bank.domain.valueObjects.Id;
import co.com.bank.interfaces.ICheckingAccountOperations;

public abstract class Account implements ICheckingAccountOperations {
    protected final Id id;
    protected final Holder holder;
    protected final Statement statement;
    protected final Balance balance;

    public Account(Holder holder, Statement statement, Balance balance) {
        this.id = new Id();
        this.holder = holder;
        this.statement = statement;
        this.balance = balance;
    }
}
