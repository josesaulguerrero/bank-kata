package co.com.bank.domain.valueObjects;

public class Balance {
    private final Money value;

    public Balance(Money value) {
        this.value = value;
    }

    // update method?

    public Money getValue() {
        return value;
    }
}
