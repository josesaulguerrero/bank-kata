package co.com.bank.entities;

import co.com.bank.domain.valueObjects.Id;

public abstract class Person {
    protected Id id;
    protected String name;

    public Person(String name) {
        this.id = new Id();
        this.name = name;
    }
}
