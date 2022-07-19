package co.com.bank.entities;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static Bank instance;
    private final List<Account> accounts;
    // ------

    private Bank() {
        accounts = new ArrayList<>();
    }

    public static Bank getInstance() {
        if (instance == null) {
            Bank.instance = new Bank();
        }
        return instance;
    }

    public void createAccount(Account account) {
        this.accounts.add(account);
    }
}
