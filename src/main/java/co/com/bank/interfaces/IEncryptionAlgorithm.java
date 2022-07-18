package co.com.bank.interfaces;

public interface IEncryptionAlgorithm {
    String generate(Integer salt, String content);
    Boolean verify(String content, String hash);
}
