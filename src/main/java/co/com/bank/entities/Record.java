package co.com.bank.entities;

import co.com.bank.domain.utils.UUIDGenerator;
import co.com.bank.domain.valueObjects.Date;
import co.com.bank.domain.valueObjects.Money;
import co.com.bank.interfaces.IIdGenerator;

public class Record {
    private static final IIdGenerator idGenerator = new UUIDGenerator();
    // -----------
    private final String id;
    private final Date date;
    private final Money credit;
    private final Money debit;
    private final Money previousBalance;
    private final Money newBalance;

    public Record(Money previousBalance, Money newBalance, Money credit, Money debit) {
        this.id = idGenerator.generate();
        this.previousBalance = previousBalance;
        this.newBalance = newBalance;
        this.date = new Date();
        this.credit = credit;
        this.debit = debit;
    }

    public String getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Money getCredit() {
        return credit;
    }

    public Money getDebit() {
        return debit;
    }

    public Money getPreviousBalance() {
        return previousBalance;
    }

    public Money getNewBalance() {
        return newBalance;
    }
}
