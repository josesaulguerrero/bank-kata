package co.com.bank.entities;

import co.com.bank.domain.valueObjects.Balance;
import co.com.bank.domain.valueObjects.Id;
import co.com.bank.interfaces.ICheckingAccountOperations;

public class CheckingAccount implements ICheckingAccountOperations {
    private final Id id;
    private final Holder holder;
    private final Statement statement;
    private final Balance balance;

    public CheckingAccount(Holder holder, Statement statement) {
        this.id = new Id();
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

    public Id getId() {
        return id;
    }

    public Holder getHolder() {
        return holder;
    }

    public Balance getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "id='" + id.getValue() + '\'' +
                ", holder=" + holder.getId() + " - " + holder.getName() +
                ", statement=" + statement.getTransactions() +
                ", balance=" + balance.getValue() +
                '}';
    }
}
