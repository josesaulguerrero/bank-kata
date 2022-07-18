package co.com.bank.domain.utils;

import at.favre.lib.crypto.bcrypt.BCrypt;
import co.com.bank.interfaces.IEncryptionAlgorithm;

public class BcryptEncryptionAlgorithm implements IEncryptionAlgorithm {
    @Override
    public String generate(Integer salt, String content) {
        return BCrypt.withDefaults().hashToString(salt, content.toCharArray());
    }

    @Override
    public Boolean verify(String content, String hash) {
        return BCrypt.verifyer().verify(content.toCharArray(), hash).verified;
    }
}
