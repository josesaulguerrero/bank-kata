package co.com.bank.interfaces;

public interface IEncryptionAlgorithm {
    String generate();
    Boolean isValid(String string);
}
