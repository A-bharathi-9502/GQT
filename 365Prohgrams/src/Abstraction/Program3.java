package Abstraction;
abstract class Animal1 {
    abstract void eat();
    abstract void sleep();
}

class Dog1 extends Animal1 {
    void eat() {
        System.out.println("Dog eats bones");
    }
    void sleep() {
        System.out.println("Dog sleeps at night");
    }
}

class Cat1 extends Animal1{
    void eat() {
        System.out.println("Cat eats fish");
    }
    void sleep() {
        System.out.println("Cat sleeps during the day");
    }
}

public class Program3 {
    public static void main(String[] args) {
        Animal1 a1 = new Dog1();
        a1.eat();
        a1.sleep();

        Animal1 a2 = new Cat1();
        a2.eat();
        a2.sleep();
    }
}
