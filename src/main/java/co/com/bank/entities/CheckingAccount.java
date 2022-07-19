package co.com.bank.entities;

import co.com.bank.domain.valueObjects.Balance;
import co.com.bank.domain.valueObjects.Id;
import co.com.bank.domain.valueObjects.Money;

import java.util.List;
import java.util.function.Consumer;

public class CheckingAccount extends Account  {

    public CheckingAccount(Holder holder, Statement statement) {
        super(holder, statement, new Balance());
    }

    @Override
    public void withdraw(Money amount) {
        Balance newBalance = balance.subtract(amount);
        Record record = new Record(
                this.balance.getValue(),
                newBalance.getValue(),
                Money.valueOf(0.0),
                amount
        );
        Transaction transaction = new Transaction(record);
        this.balance.update(newBalance.getValue());
        this.statement.addTransaction(transaction);
    }

    @Override
    public void deposit(Money amount) {
        Balance newBalance = balance.sum(amount);
        Record record = new Record(
                this.balance.getValue(),
                newBalance.getValue(),
                amount,
                new Money()
        );
        this.balance.update(newBalance.getValue());
        Transaction transaction = new Transaction(record);
        this.statement.addTransaction(transaction);
    }

    @Override
    public void transfer(Account targetAccount, Money amount) {
        this.withdraw(amount);
        targetAccount.deposit(amount);
    }

    @Override
    public void getStatement(Consumer<Statement> consumer) {
        consumer.accept(this.statement);
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
