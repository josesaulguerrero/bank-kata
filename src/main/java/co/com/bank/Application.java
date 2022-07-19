package co.com.bank;

import co.com.bank.domain.valueObjects.Balance;
import co.com.bank.domain.valueObjects.Date;
import static co.com.bank.domain.valueObjects.Money.valueOf;
import co.com.bank.entities.Account;
import co.com.bank.entities.CheckingAccount;
import co.com.bank.entities.Holder;
import co.com.bank.entities.Statement;

public class Application {
    public static void main(String[] args) {
        Holder holderOne = new Holder("Jose Serrano", "##FIRULAIS_54321");
        Statement statementOne = new Statement();
        Account accountOne = new CheckingAccount(holderOne, statementOne);

        Holder holderTwo = new Holder("Pepito Perez", "12345_super_easy");
        Statement statementTwo = new Statement();
        Account accountTwo = new CheckingAccount(holderTwo, statementTwo);

        accountOne.deposit(valueOf(1000.0));
        accountOne.deposit(valueOf(2000.0));
        accountOne.withdraw(valueOf(500.0));

        accountOne.transfer(accountTwo, valueOf(900.0));
        accountTwo.deposit(valueOf(1000.0));

        accountOne.getStatement((statement) -> {
            statement.getTransactions().forEach(System.out::println);
        });
        accountTwo.getStatement((statement) -> {
            statement.getTransactions().forEach(System.out::println);
        });
    }
}