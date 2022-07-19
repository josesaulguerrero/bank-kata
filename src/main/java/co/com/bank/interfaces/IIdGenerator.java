package co.com.bank.interfaces;

import co.com.bank.domain.valueObjects.Id;

public interface IIdGenerator {
    String generate();
    Boolean equals(String a, String b);
}
