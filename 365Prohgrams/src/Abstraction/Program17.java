package Abstraction;
abstract class Vehicle1 {
    abstract void drive();
    abstract void stop();
}

class Car1 extends Vehicle1 {
    void drive() {
        System.out.println("Car is driving");
    }
    void stop() {
        System.out.println("Car stopped");
    }
}

class Truck1 extends Vehicle1 {
    void drive() {
        System.out.println("Truck is driving");
    }
    void stop() {
        System.out.println("Truck stopped");
    }
}

public class Program17 {
    public static void main(String[] args) {
        Vehicle1 v1 = new Car1();
        v1.drive();
        v1.stop();

        Vehicle1 v2 = new Truck1();
        v2.drive();
        v2.stop();
    }
}
