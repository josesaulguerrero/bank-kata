package co.com.bank.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Bank {
    private static Bank instance;
    private final List<CheckingAccount> checkingAccounts;
    // ------

    private Bank() {
        this.checkingAccounts = new ArrayList<>();
    }

    public static Bank getInstance() {
        if (instance == null) {
            Bank.instance = new Bank();
        }
        return instance;
    }

    public static void createAccount(Account account) {

    }
}
