package co.com.bank.interfaces;

import co.com.bank.domain.valueObjects.Id;
import co.com.bank.domain.valueObjects.Money;

public interface ICheckingAccountOperations {
    void withdraw(Money money);
    void deposit(Money money);
    void transfer(String targetId, Money money);
    void getStatement();
}
