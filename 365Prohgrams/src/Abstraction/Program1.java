package Abstraction;
abstract class Shape {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Circle extends Shape {
    double r = 5;

    void calculateArea() {
        System.out.println("Circle Area: " + (3.14 * r * r));
    }

    void calculatePerimeter() {
        System.out.println("Circle Perimeter: " + (2 * 3.14 * r));
    }
}

class Rectangle extends Shape {
    int l = 4, b = 6;

    void calculateArea() {
        System.out.println("Rectangle Area: " + (l * b));
    }

    void calculatePerimeter() {
        System.out.println("Rectangle Perimeter: " + (2 * (l + b)));
    }
}

public class Program1 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.calculateArea();
        s1.calculatePerimeter();

        Shape s2 = new Rectangle();
        s2.calculateArea();
        s2.calculatePerimeter();
    }
}
