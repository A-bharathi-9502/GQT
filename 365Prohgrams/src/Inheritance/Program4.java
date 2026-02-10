package Inheritance;
class Employee {
 String company;

 Employee() {
     company = "Infosys";
 }

 void displayCompany() {
     System.out.println("Company: " + company);
 }
}
class Developer extends Employee {
 String role = "Software Developer";

 void displayDeveloper() {
     displayCompany();   // invoking base class method
     System.out.println("Role: " + role);
 }
}

class Tester extends Employee {
 String role = "Software Tester";

 void displayTester() {
     displayCompany();   
     System.out.println("Role: " + role);
 }
}

public class Program4 {
 public static void main(String[] args) {

     Developer d = new Developer();
     System.out.println("Developer Details:");
     d.displayDeveloper();

     System.out.println();

     Tester t = new Tester();
     System.out.println("Tester Details:");
     t.displayTester();
 }
}
