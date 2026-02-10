package Abstraction;
abstract class BankAccount {
    abstract void deposit();
    abstract void withdraw();
}

class SavingsAccount extends BankAccount {
    void deposit() {
        System.out.println("Deposited in Savings Account");
    }
    void withdraw() {
        System.out.println("Withdrawn from Savings Account");
    }
}

class CurrentAccount extends BankAccount {
    void deposit() {
        System.out.println("Deposited in Current Account");
    }
    void withdraw() {
        System.out.println("Withdrawn from Current Account");
    }
}

public class Program7 {
    public static void main(String[] args) {
        BankAccount b1 = new SavingsAccount();
        b1.deposit();
        b1.withdraw();

        BankAccount b2 = new CurrentAccount();
        b2.deposit();
        b2.withdraw();
    }
}
