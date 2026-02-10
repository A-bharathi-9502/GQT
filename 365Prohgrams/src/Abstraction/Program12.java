package Abstraction;
abstract class Animal6{
    abstract void eat();
    abstract void sleep();
}
class Dog6 extends Animal6 {
    void eat() {
        System.out.println("Dog eats bones");
    }
    void sleep() {
        System.out.println("Dog sleeps at night");
    }
}
class Cat6 extends Animal6 {
    void eat() {
        System.out.println("Cat eats fish");
    }
    void sleep() {
        System.out.println("Cat sleeps during the day");
    }
}
public class Program12 {
    public static void main(String[] args) {
        Animal6 a1 = new Dog6();
        a1.eat();
        a1.sleep();
        Animal6 a2 = new Cat6();
        a2.eat();
        a2.sleep();
    }
}

 
