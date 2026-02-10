package Inheritance;
class Shape1 {
    String type;
    String color;
}

class Triangle extends Shape1 {
    double base;
    double height;
}

class Program13 {
    public static void main(String[] args) {
        Shape1 s = new Shape1();
        s.type = "Generic Shape";
        s.color = "Red";

        Triangle t = new Triangle();
        t.type = "Triangle";
        t.color = "Blue";
        t.base = 10;
        t.height = 5;

        System.out.println(s.type + " " + s.color);
        System.out.println(t.type + " " + t.color + " " + t.base + " " + t.height);
    }
}
