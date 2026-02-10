package Inheritance;
class Animal {
 String name;
 int age;
 Animal(String name, int age) {
     this.name = name;
     this.age = age;
 }

 void displayAnimal() {
     System.out.println("Name : " + name);
     System.out.println("Age : " + age);
 }
}

//Subclass
class Dog extends Animal {
 String breed;

 Dog(String name, int age, String breed) {
     super(name, age);
     this.breed = breed;
 }

 void displayDog() {
     displayAnimal();
     System.out.println("Breed : " + breed);
 }
}

class Cat extends Animal {
 String color;

 Cat(String name, int age, String color) {
     super(name, age);
     this.color = color;
 }

 void displayCat() {
     displayAnimal();
     System.out.println("Color : " + color);
 }
}

public class Program5 {
 public static void main(String[] args) {
     Dog d = new Dog("Bruno", 3, "German Shepherd");
     System.out.println("Dog Details:");
     d.displayDog();

     System.out.println();

     Cat c = new Cat("Kitty", 2, "White");
     System.out.println("Cat Details:");
     c.displayCat();
 }
}
