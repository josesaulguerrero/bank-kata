package co.com.bank.domain.utils;

import co.com.bank.domain.valueObjects.Id;
import co.com.bank.interfaces.IIdGenerator;

import java.util.UUID;

public class UUIDGenerator implements IIdGenerator {
    private UUID getUUIDFromString(String string) {
        return UUID.fromString(string);
    }

    @Override
    public String generate() {
        return UUID.randomUUID().toString();
    }

    @Override
    public Boolean equals(String a, String b) {
        return getUUIDFromString(a).equals(getUUIDFromString(b));
    }
}
