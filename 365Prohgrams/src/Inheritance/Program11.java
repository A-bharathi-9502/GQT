package Inheritance;
class BankAccount {
    int accountNumber;
    double balance;
}

class SavingsAccount extends BankAccount {
    double interestRate;
}

class CurrentAccount extends BankAccount {
    double overdraftLimit;
}

class Program11 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.accountNumber = 111;
        s.balance = 5000;
        s.interestRate = 4.5;

        CurrentAccount c = new CurrentAccount();
        c.accountNumber = 222;
        c.balance = 10000;
        c.overdraftLimit = 2000;

        System.out.println(s.accountNumber + " " + s.balance + " " + s.interestRate);
        System.out.println(c.accountNumber + " " + c.balance + " " + c.overdraftLimit);
    }
}
