package Inheritance;
class Fruit2 {
    String name;
    String color;
}

class Apple2 extends Fruit2 {
    String taste;
}

class Banana2 extends Fruit2 {
    String size;
}

class Program17 {
    public static void main(String[] args) {
        Apple a = new Apple();
        a.name = "Apple";
        a.color = "Red";
        a.taste = "Sweet";

        Banana b = new Banana();
        b.name = "Banana";
        b.color = "Yellow";
        b.size = "Large";

        System.out.println(a.name + " " + a.color + " " + a.taste);
        System.out.println(b.name + " " + b.color + " " + b.size);
    }
}
