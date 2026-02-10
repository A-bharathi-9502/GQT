package Inheritance;
class Vehicle1 {
    String make;
    String model;
    int year;
}

class Truck extends Vehicle1{
    int capacity;
    int mileage;
}

class Program15 {
    public static void main(String[] args) {
        Vehicle1 v = new Vehicle1();
        v.make = "Tata";
        v.model = "Ace";
        v.year = 2020;

        Truck t = new Truck();
        t.make = "Ashok Leyland";
        t.model = "Dost";
        t.year = 2022;
        t.capacity = 2000;
        t.mileage = 15;

        System.out.println(v.make + " " + v.model + " " + v.year);
        System.out.println(t.make + " " + t.model + " " + t.year + " " + t.capacity + " " + t.mileage);
    }
}
