package Inheritance;
class Fruit {
 String name;
 String color;
}
class Apple extends Fruit {
 String taste;
}
class Banana extends Fruit {
 String size;
}
public class Program6 {
 public static void main(String[] args) {
     Apple a = new Apple();
     a.name = "Apple";      
     a.color = "Red";    
     a.taste = "Sweet";    
     Banana b = new Banana();
     b.name = "Banana";    
     b.color = "Yellow";    
     b.size = "Large"; 
     System.out.println("Apple Details:");
     System.out.println(a.name + " " + a.color + " " + a.taste);

     System.out.println();

     System.out.println("Banana Details:");
     System.out.println(b.name + " " + b.color + " " + b.size);
 }
}
