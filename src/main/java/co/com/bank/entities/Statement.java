package co.com.bank.entities;

import co.com.bank.domain.valueObjects.Id;

import java.util.ArrayList;
import java.util.List;

public class Statement {
    private final Id id;
    private final List<Transaction> transactions;

    public Statement() {
        this.id = new Id();
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    public Id getId() {
        return id;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "Statement{" +
                "id=" + id.getValue() +
                ", transactions=" + transactions +
                '}';
    }
}
