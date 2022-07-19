package co.com.bank.entities;

import co.com.bank.domain.valueObjects.Id;
import co.com.bank.domain.valueObjects.Password;

public class Holder extends Person {
    private Password password;

    public Holder(String name, String password) {
        super(name);
        this.password = new Password(password);
    }

    public Id getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password.getValue();
    }

    public void setPassword(String password) {
        this.password = new Password(password);
    }
}
