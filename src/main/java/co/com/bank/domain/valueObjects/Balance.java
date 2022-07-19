package co.com.bank.domain.valueObjects;

public class Balance {
    private final Money value;

    public Balance() {
        this.value = Money.valueOf(0.0);
    }

    public Balance(Money value) {
        this.value = value;
    }

    // update method?

    public Money getValue() {
        return value;
    }
}
