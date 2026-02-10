package Abstraction;
abstract class Shape2 {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Rectangle1 extends Shape2 {
    int length = 5;
    int breadth = 4;

    void calculateArea() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    void calculatePerimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + breadth)));
    }
}

class Square extends Shape2{
    int side = 4;

    void calculateArea() {
        System.out.println("Area of Square: " + (side * side));
    }

    void calculatePerimeter() {
        System.out.println("Perimeter of Square: " + (4 * side));
    }
}

public class Program23 {
    public static void main(String[] args) {

        Shape2 s1 = new Rectangle1();   // upcasting
        s1.calculateArea();
        s1.calculatePerimeter();

        Shape2 s2 = new Square();      // upcasting
        s2.calculateArea();
        s2.calculatePerimeter();
    }
}
