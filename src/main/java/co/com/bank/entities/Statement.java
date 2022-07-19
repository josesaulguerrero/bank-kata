package co.com.bank.entities;

import co.com.bank.domain.utils.UUIDGenerator;
import co.com.bank.interfaces.IIdGenerator;

import java.util.ArrayList;
import java.util.List;

public class Statement {
    private static final IIdGenerator idGenerator = new UUIDGenerator();
    // -----------
    private final String id;
    private final List<Transaction> transactions;

    public Statement() {
        this.id = idGenerator.generate();
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    public String getId() {
        return id;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
