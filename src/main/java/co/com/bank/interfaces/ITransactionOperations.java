package co.com.bank.interfaces;

import co.com.bank.entities.Account;

public interface ITransactionOperations {
    void commit(Account account);
    // void rollback(); could be added later on.
}
