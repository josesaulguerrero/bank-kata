package co.com.bank.domain.valueObjects;

public class Money {
    private final Double value;

    public Money() {
        this.value = 0.0;
    }

    private Money(Double value) {
        this.value = value;
    }

    public static Money valueOf(Double value) {
        return new Money(value);
    }

    public static Money valueOf(String value) {
        return new Money(Double.valueOf(value));
    }

    public Money sum(Money value) {
        Double result = value.getValue() + this.value;
        return new Money(result);
    }

    public Money subtract(Money value) {
        Double result = this.value - value.getValue();
        return new Money(result);
    }

    public Double getValue() {
        return value;
    }
}
