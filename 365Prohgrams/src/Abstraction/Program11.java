package Abstraction;
abstract class Shape1 {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}
class Triangle extends Shape1 {
    int b = 5, h = 4;
    void calculateArea() {
        System.out.println("Triangle Area: " + (0.5 * b * h));
    }
    void calculatePerimeter() {
        System.out.println("Triangle Perimeter: 12");
    }
}
class Circle1 extends Shape1 {
    int r = 3;
    void calculateArea() {
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
    void calculatePerimeter() {
        System.out.println("Circle Perimeter: " + (2 * 3.14 * r));
    }
}
public class Program11 {
    public static void main(String[] args) {
        Shape1 s1 = new Triangle();
        s1.calculateArea();
        s1.calculatePerimeter();
        Shape1 s2 = new Circle1();
        s2.calculateArea();
        s2.calculatePerimeter();
    }
}
