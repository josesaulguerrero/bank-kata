package co.com.bank.entities;

import co.com.bank.domain.utils.UUIDGenerator;
import co.com.bank.interfaces.IIdGenerator;

public abstract class Person {
    private static final IIdGenerator idGenerator = new UUIDGenerator();
    // -----------
    protected String id;
    protected String name;

    public Person(String name) {
        this.id = idGenerator.generate();
        this.name = name;
    }
}
