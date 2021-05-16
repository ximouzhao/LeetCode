package huawei.router;

import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Random;

public class Scram {
    int Keysize = 8;

    public static final String PBKDF2_ALGORITHM = "PBKDF2WithSHA256";

    public static final String SOURCES =
            "abcdefghijklmnopqrstuvwxyz1234567890";

    public String getNonce(int length) {
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = SOURCES.charAt(new Random().nextInt(SOURCES.length()));
        }
        return new String(text);
    }

    /**
     * pbkdf2
     */
    String getSaltedPassword(String password, String salt, int iterations) {
        try {
            KeySpec spec = new PBEKeySpec(password.toCharArray(), fromHex(salt), iterations, Keysize);
            SecretKeyFactory f = SecretKeyFactory.getInstance(PBKDF2_ALGORITHM);
            return toHex(f.generateSecret(spec).getEncoded());
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * ClientKey = HMAC(saltPwd, "Client Key")
     */
    public String getClientKey(String saltPwd) {
        try {
            SecretKeySpec signingKey = new SecretKeySpec("Client Key".getBytes(), "HmacSHA256");
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(signingKey);
            return new String(mac.doFinal(saltPwd.getBytes()));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * ServerKey = HMAC(saltPwd, "Server Key")
     */
    byte[] getServerKey(String value) {
        return this.getHmac("Server Key",value);
    }

    byte[] getHmac(String salt,String value){
        try {
            SecretKeySpec signingKey = new SecretKeySpec(salt.getBytes(), "HmacSHA256");
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(signingKey);
            return mac.doFinal(value.getBytes());
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * StoredKey = HASH(ClientKey)
     */
    byte [] getStoredKey(String clientKey) {

        MessageDigest messageDigest;
        String encodestr = "";
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(clientKey.getBytes(StandardCharsets.UTF_8));
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Signature = HMAC(StoredKey, AuthMessage)
     */
    byte[] signature(byte[] storedKey,String authMessage) {
        return this.getHmac(new String(storedKey),authMessage);
    }

    /**
     * ClientProof = ClientKey ^ ClientSignature
     */
    String clientProof(String password,String salt,int iterations,String authMessage) {
        String spwd = this.getSaltedPassword(password, salt, iterations);
        String ckey = this.getClientKey(spwd);
        byte[] skey = this.getStoredKey(ckey);
        byte[] csig = this.signature(skey, authMessage);
        /*
        for (var i = 0; i < ckey.sigBytes / 4; i += 1) {
            ckey.words[i] = ckey.words[i] ^ csig.words[i]
        }*/
        return ckey.toString();
    }

    /**
     * ServerProof = HMAC(ServerKey, AuthMessage)
     */
    String serverProof(String password,String salt,int iterations,String authMessage) {
        String spwd = this.getSaltedPassword(password, salt, iterations);
        byte[] skey = this.getServerKey(spwd);
        //String sig = this.signature(skey, authMessage);
        //return sig.toString();
        return "";
    }

    private static byte[] fromHex(String hex) {
        byte[] binary = new byte[hex.length() / 2];
        for (int i = 0; i < binary.length; i++) {
            binary[i] = (byte) Integer.parseInt(hex.substring(2 * i, 2 * i + 2), 16);
        }
        return binary;
    }

    private static String toHex(byte[] array) {
        BigInteger bi = new BigInteger(1, array);
        String hex = bi.toString(16);
        int paddingLength = (array.length * 2) - hex.length();
        if (paddingLength > 0) {
            return String.format("%0" + paddingLength + "d", 0) + hex;
        } else {
            return hex;
        }
    }
}
