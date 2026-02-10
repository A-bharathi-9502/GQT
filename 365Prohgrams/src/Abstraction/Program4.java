package Abstraction;
abstract class Animal3 {
    abstract void eat();
    abstract void sleep();
}

class Dog3 extends Animal3 {
    void eat() {
        System.out.println("Dog eats bones");
    }
    void sleep() {
        System.out.println("Dog sleeps at night");
    }
}

class Cat3 extends Animal3{
    void eat() {
        System.out.println("Cat eats fish");
    }
    void sleep() {
        System.out.println("Cat sleeps during the day");
    }
}

public class Program4 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.eat();
        a1.sleep();

        Animal a2 = new Cat();
        a2.eat();
        a2.sleep();
    }
}
