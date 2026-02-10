package Interfaces;
interface Encryptable {
    void encrypt();
}

interface Decryptable {
    void decrypt();
}

class Encoder implements Encryptable {
    public void encrypt() {
        System.out.println("Data encrypted");
    }
}

class Decoder implements Decryptable {
    public void decrypt() {
        System.out.println("Data decrypted");
    }
}

public class Program15 {
    public static void main(String[] args) {
        Encoder e = new Encoder();
        Decoder d = new Decoder();

        e.encrypt();
        d.decrypt();
    }
}
