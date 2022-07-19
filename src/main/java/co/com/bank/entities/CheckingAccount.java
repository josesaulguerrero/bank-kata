package co.com.bank.entities;

import co.com.bank.domain.valueObjects.Balance;
import co.com.bank.domain.valueObjects.Id;

public class CheckingAccount extends Account  {

    public CheckingAccount(Holder holder, Statement statement) {
        super(holder, statement, new Balance());
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
                "id='" + this.id.getValue() + '\'' +
                ", holder=" + holder.getId() + " - " + holder.getName() +
                ", statement=" + statement.getTransactions() +
                ", balance=" + balance.getValue() +
                '}';
    }
}
