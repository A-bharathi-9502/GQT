package Interfaces;
interface Sendable {
    void send();
}

interface Receivable {
    void receive();
}

class Transmitter implements Sendable {
    public void send() {
        System.out.println("Sending signal");
    }
}

class Receiver implements Receivable {
    public void receive() {
        System.out.println("Receiving signal");
    }
}

public class Program23 {
    public static void main(String[] args) {
        Transmitter t = new Transmitter();
        Receiver r = new Receiver();

        t.send();
        r.receive();
    }
}
