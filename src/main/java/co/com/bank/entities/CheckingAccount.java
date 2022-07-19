package co.com.bank.entities;

import co.com.bank.domain.valueObjects.Balance;
import co.com.bank.domain.valueObjects.Id;
import co.com.bank.domain.valueObjects.Money;

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
        System.out.println("Your withdrawal was successful. Get your money at the window.");
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
        Transaction transaction = new Transaction(record);
        this.statement.addTransaction(transaction);
        System.out.println("Your deposit was successful. Thanks for choosing us.");
    }

    @Override
    public void transfer(String targetId, Money money) {

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
