package Inheritance;
class Vehicle2 {
    String make;
    String model;
    int year;
}

class Car1 extends Vehicle2 {
    String color;
    int mileage;
}

class Program25 {
    public static void main(String[] args) {
        Vehicle2 v = new Vehicle2();
        v.make = "Honda";
        v.model = "City";
        v.year = 2021;

        Car1 c = new Car1();
        c.make = "Toyota";
        c.model = "Innova";
        c.year = 2023;
        c.color = "White";
        c.mileage = 18;

        System.out.println(v.make + " " + v.model + " " + v.year);
        System.out.println(c.make + " " + c.model + " " + c.year + " " + c.color + " " + c.mileage);
    }
}
