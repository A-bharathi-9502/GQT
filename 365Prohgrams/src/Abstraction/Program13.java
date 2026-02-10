package Abstraction;
abstract class Bank {
    abstract void openAccount();
    abstract void closeAccount();
}

class SavingsBank extends Bank {
    void openAccount() {
        System.out.println("Savings Account opened");
    }
    void closeAccount() {
        System.out.println("Savings Account closed");
    }
}

class CurrentBank extends Bank {
    void openAccount() {
        System.out.println("Current Account opened");
    }
    void closeAccount() {
        System.out.println("Current Account closed");
    }
}

public class Program13 {
    public static void main(String[] args) {
        Bank b1 = new SavingsBank();
        b1.openAccount();
        b1.closeAccount();

        Bank b2 = new CurrentBank();
        b2.openAccount();
        b2.closeAccount();
    }
}
