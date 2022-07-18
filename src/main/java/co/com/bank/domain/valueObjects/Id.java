package co.com.bank.domain.valueObjects;

import co.com.bank.domain.utils.UUIDGenerator;
import co.com.bank.interfaces.IIdGenerator;

public class Id {
    private static final IIdGenerator idGenerator = new UUIDGenerator();
    //--------------
    private final String value;

    public Id(IIdGenerator idGenerator) {
        this.value = idGenerator.generate();
    }

    public String getValue() {
        return value;
    }
}
