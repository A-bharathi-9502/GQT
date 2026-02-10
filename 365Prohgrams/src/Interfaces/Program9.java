package Interfaces;
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class Printer implements Printable {
    public void print() {
        System.out.println("Printing document");
    }
}

class ScannerMachine implements Scannable {
    public void scan() {
        System.out.println("Scanning document");
    }
}

public class Program9 {
    public static void main(String[] args) {
        Printer p = new Printer();
        ScannerMachine s = new ScannerMachine();

        p.print();
        s.scan();
    }
}
