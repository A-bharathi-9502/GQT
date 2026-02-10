package Inheritance;
class Person1 {
    String name;
    int age;
}
class Employee2 extends Person1 {
    int id;
    double salary;
}
class Program21 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Ravi";
        p.age = 35;
        Employee2 e = new Employee2();
        e.name = "Bharathi";
        e.age = 22;
        e.id = 101;
        e.salary = 25000;
        System.out.println(p.name + " " + p.age);
        System.out.println(e.name + " " + e.age + " " + e.id + " " + e.salary);
    }
}
