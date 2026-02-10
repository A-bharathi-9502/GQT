package Inheritance;
abstract class Shape {
 abstract void calculateArea();
 abstract void calculatePerimeter();
}
class Circle extends Shape {
 double radius;

 Circle(double radius) {
     this.radius = radius;
 }
 void calculateArea() {
     System.out.println("Circle Area : " + (Math.PI * radius * radius));
 }
 void calculatePerimeter() {
     System.out.println("Circle Perimeter : " + (2 * Math.PI * radius));
 }
}
class Rectangle extends Shape {
 double length, width;

 Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 void calculateArea() {
     System.out.println("Rectangle Area : " + (length * width));
 }

 void calculatePerimeter() {
     System.out.println("Rectangle Perimeter : " + (2 * (length + width)));
 }
}
public class Program2 {
 public static void main(String[] args) {
     Shape s1 = new Circle(5);
     s1.calculateArea();
     s1.calculatePerimeter();

     Shape s2 = new Rectangle(10, 5);
     s2.calculateArea();
     s2.calculatePerimeter();
 }
}
