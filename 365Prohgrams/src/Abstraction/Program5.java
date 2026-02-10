package Abstraction;
abstract class Employee {
    abstract void calculateSalary();
    abstract void calculateBonus();
}

class Manager extends Employee {
    void calculateSalary() {
        System.out.println("Manager Salary: 50000");
    }
    void calculateBonus() {
        System.out.println("Manager Bonus: 10000");
    }
}

class Clerk extends Employee {
    void calculateSalary() {
        System.out.println("Clerk Salary: 20000");
    }
    void calculateBonus() {
        System.out.println("Clerk Bonus: 3000");
    }
}

public class Program5{
    public static void main(String[] args) {
        Employee e1 = new Manager();
        e1.calculateSalary();
        e1.calculateBonus();

        Employee e2 = new Clerk();
        e2.calculateSalary();
        e2.calculateBonus();
    }
}
