package Interfaces;
class EncryptionAlgorithm implements Encryptable {
    public void encrypt() {
        System.out.println("Algorithm encrypting data");
    }
}

class DecryptionAlgorithm implements Decryptable {
    public void decrypt() {
        System.out.println("Algorithm decrypting data");
    }
}

public class Program25 {
    public static void main(String[] args) {
        EncryptionAlgorithm e = new EncryptionAlgorithm();
        DecryptionAlgorithm d = new DecryptionAlgorithm();

        e.encrypt();
        d.decrypt();
    }
}
