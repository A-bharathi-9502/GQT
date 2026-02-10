package Inheritance;
class Shape3 {
 String type;
 String color;
}
class Circle1 extends Shape3 {
 double radius;
 double area;
}

public class Program29 {
 public static void main(String[] args) {
     Shape3 s = new Shape3();
     s.type = "Shape";
     s.color = "Blue";
     Circle1 c = new Circle1();
     c.type = "Circle";      
     c.color = "Red";        
     c.radius = 5;
     c.area = 3.14 * c.radius * c.radius;

     System.out.println("Shape Details:");
     System.out.println(s.type + " " + s.color);

     System.out.println("\nCircle Details:");
     System.out.println(c.type + " " + c.color + " " + c.radius + " " + c.area);
 }
}
