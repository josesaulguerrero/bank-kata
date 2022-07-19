package co.com.bank.interfaces;

import co.com.bank.domain.valueObjects.Money;
import co.com.bank.entities.Account;
import co.com.bank.entities.Statement;

import java.util.function.Consumer;

public interface ICheckingAccountOperations {
    void withdraw(Money money);
    void deposit(Money money);
    void transfer(Account targetAccount, Money money);
    void getStatement(Consumer<Statement> consumer);
}
