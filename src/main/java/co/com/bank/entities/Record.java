package co.com.bank.entities;

import co.com.bank.domain.valueObjects.*;

public class Record {
    private final Id id;
    private final Date date;
    private final Money credit;
    private final Money debit;
    private final Money previousBalance;
    private final Money newBalance;

    public Record(Money previousBalance, Money newBalance, Money credit, Money debit) {
        this.id = new Id();
        this.previousBalance = previousBalance;
        this.newBalance = newBalance;
        this.date = new Date();
        this.credit = credit;
        this.debit = debit;
    }

    public Id getId() {
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

    @Override
    public String toString() {
        return "Record{" +
                    "id=" + id.getValue() +
                    "previous balance=" + previousBalance.getValue() + " - " +
                    "date=" + date.getValue() + " - " +
                    "credit=" + credit.getValue() + " - " +
                    "debit:" + debit.getValue() + " - " +
                    "new balance=" + newBalance.getValue() +
                '}';
    }
}
