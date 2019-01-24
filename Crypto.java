import java.math.BigInteger;

public class Crypto {
    public static BigInteger rsa_crypt(BigInteger msg, Key key) {
        return msg.modPow(key.getExp(), key.getN());
    }

    public static BigInteger diffieHelman(BigInteger g, BigInteger n, Key key) {
        return g.modPow(key.getExp(), n);
    }
}