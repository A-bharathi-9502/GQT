package Abstraction;
abstract class Animal4{
    abstract void eat();
    abstract void sleep();
}

class Dog4 extends Animal4 {
    void eat() {
        System.out.println("Dog eats bones");
    }
    void sleep() {
        System.out.println("Dog sleeps at night");
    }
}

class Cat4 extends Animal4 {
    void eat() {
        System.out.println("Cat eats fish");
    }
    void sleep() {
        System.out.println("Cat sleeps during the day");
    }
}

public class Program8 {
    public static void main(String[] args) {
        Animal4 a1 = new Dog4();
        a1.eat();
        a1.sleep();

        Animal4 a2 = new Cat4();
        a2.eat();
        a2.sleep();
    }
}
