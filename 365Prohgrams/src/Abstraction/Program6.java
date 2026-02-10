package Abstraction;
abstract class Animal2 {
    abstract void eat();
    abstract void sleep();
}

class Dog2 extends Animal2 {
    void eat() {
        System.out.println("Dog eats bones");
    }
    void sleep() {
        System.out.println("Dog sleeps at night");
    }
}

class Cat2 extends Animal2 {
    void eat() {
        System.out.println("Cat eats fish");
    }
    void sleep() {
        System.out.println("Cat sleeps during the day");
    }
}

public class Program6 {
    public static void main(String[] args) {
        Animal2 a1 = new Dog2();
        a1.eat();
        a1.sleep();

        Animal2 a2 = new Cat2();
        a2.eat();
        a2.sleep();
    }
}
