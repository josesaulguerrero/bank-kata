package co.com.bank.domain.valueObjects;

import co.com.bank.domain.utils.BcryptEncryptionAlgorithm;
import co.com.bank.interfaces.IEncryptionAlgorithm;

public class Password {
    private static final IEncryptionAlgorithm algorithm = new BcryptEncryptionAlgorithm();
    // ----------------
    private final String value;

    public Password(String password) {
        this.value = algorithm.generate(10, password);
    }

    public Boolean compare(String password) {
        return algorithm.verify(password, this.value);
    }

    public String getValue() {
        return value;
    }
}
