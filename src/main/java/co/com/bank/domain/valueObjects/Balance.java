package co.com.bank.domain.valueObjects;

public class Balance {
    private Money value;

    public Balance() {
        this.value = Money.valueOf(0.0);
    }

    public Balance(Money value) {
        this.value = value;
    }

    public Money update(Money amount) {
        this.value = amount;
        return this.value;
    }

    public Money getValue() {
        return value;
    }

    public Money subtract(Money amount) {
        return this.value.subtract(amount);
    }

    public Money sum(Money amount) {
        return this.value.sum(amount);
    }
}
