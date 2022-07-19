package co.com.bank.domain.valueObjects;

public class Balance {
    private Money value;

    public Balance() {
        this.value = Money.valueOf(0.0);
    }

    public Balance(Money value) {
        this.value = value;
    }

    public void update(Money amount) {
        this.value = amount;
    }

    public Balance subtract(Money amount) {
        return new Balance(this.value.subtract(amount));
    }

    public Balance sum(Money amount) {
        return new Balance(this.value.sum(amount));
    }

    public Money getValue() {
        return value;
    }
}
