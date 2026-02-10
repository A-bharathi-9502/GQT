package Inheritance;
class Person {
 String name;
 int age;
}

class Student extends Person {
 int rollNo;
 String course;
}

public class Program3
{
 public static void main(String[] args) {

     // Object of base class
     Person p = new Person();
     p.name = "Ravi";
     p.age = 40;

     System.out.println("Person Details:");
     System.out.println("Name: " + p.name);
     System.out.println("Age: " + p.age);

     System.out.println();

     Student s = new Student();
     s.name = "Bharathi";   
     s.age = 21;            
     s.rollNo = 101;
     s.course = "Java";

     System.out.println("Student Details:");
     System.out.println("Name: " + s.name);
     System.out.println("Age: " + s.age);
     System.out.println("Roll No: " + s.rollNo);
     System.out.println("Course: " + s.course);
 }
}
