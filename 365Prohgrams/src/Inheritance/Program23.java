package Inheritance;
class Shape2 {
    String type;
    String color;
}

class Rectangle1 extends Shape2 {
    int length;
    int width;
}

class Program23 {
    public static void main(String[] args) {
        Shape2 s = new Shape2();
        s.type = "Shape";
        s.color = "Green";

        Rectangle1 r = new Rectangle1();
        r.type = "Rectangle";
        r.color = "Blue";
        r.length = 10;
        r.width = 5;

        System.out.println(s.type + " " + s.color);
        System.out.println(r.type + " " + r.color + " " + r.length + " " + r.width);
    }
}
