package co.com.bank.domain.valueObjects;

import java.time.LocalDateTime;

public class Date {
    private final LocalDateTime value;

    public Date() {
        this.value = LocalDateTime.now();
    }

    public Date(LocalDateTime value) {
        this.value = value;
    }

    private static Boolean hasValidFormat(String string) {
        return string.matches("\\d{4}-\\d{2}-\\d{2}");
    }

    /**
     * This method parses a String into a valid Date object.
     * @param string A string that follows this pattern: YYYY-MM-DD.
     * @return Date
     */
    public static Date of(String string) {
        if(!hasValidFormat(string)) {
            throw new IllegalArgumentException("The string cannot be parsed since it doesn't follow the right format.");
        }
        LocalDateTime parsableString = LocalDateTime.parse(string);
        return new Date(parsableString);
    }

    public LocalDateTime getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Date{" +
                "value=" + value +
                '}';
    }
}
