package Abstraction;
abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog eats bones");
    }
    void sleep() {
        System.out.println("Dog sleeps at night");
    }
}

class Cat extends Animal {
    void eat() {
        System.out.println("Cat eats fish");
    }
    void sleep() {
        System.out.println("Cat sleeps during the day");
    }
}

public class Program2 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.eat();
        a1.sleep();

        Animal a2 = new Cat();
        a2.eat();
        a2.sleep();
    }
}
