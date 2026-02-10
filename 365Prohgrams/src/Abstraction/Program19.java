package Abstraction;


public class Program19 {
    public static void main(String[] args) {

        BankAccount b1 = new SavingsAccount();   // upcasting
        b1.deposit();
        b1.withdraw();

        BankAccount b2 = new CurrentAccount();   // upcasting
        b2.deposit();
        b2.withdraw();
    }
}
