package Inheritance;
class Person3 {
    String name;
    int age;
}

class Student3 extends Person3 {
    int rollNo;
}

class Teacher extends Person3 {
    String subject;
}

class Program9 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Anu";
        s.age = 20;
        s.rollNo = 101;

        Teacher t = new Teacher();
        t.name = "Mr. Rao";
        t.age = 45;
        t.subject = "Java";

        System.out.println(s.name + " " + s.age + " " + s.rollNo);
        System.out.println(t.name + " " + t.age + " " + t.subject);
    }
}
