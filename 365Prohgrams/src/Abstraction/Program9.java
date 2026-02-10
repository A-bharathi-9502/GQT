package Abstraction;
abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car started");
    }
    void stop() {
        System.out.println("Car stopped");
    }
}

class Motorcycle extends Vehicle {
    void start() {
        System.out.println("Motorcycle started");
    }
    void stop() {
        System.out.println("Motorcycle stopped");
    }
}

public class Program9 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.start();
        v1.stop();

        Vehicle v2 = new Motorcycle();
        v2.start();
        v2.stop();
    }
}
