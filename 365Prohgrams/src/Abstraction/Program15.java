package Abstraction;
abstract class Figure {
    abstract void draw();
    abstract void erase();
}

class Rectangle2 extends Figure {
    void draw() {
        System.out.println("Rectangle drawn");
    }
    void erase() {
        System.out.println("Rectangle erased");
    }
}

class Circle2 extends Figure {
    void draw() {
        System.out.println("Circle drawn");
    }
    void erase() {
        System.out.println("Circle erased");
    }
}

public class Program15 {
    public static void main(String[] args) {
        Figure f1 = new Rectangle2();
        f1.draw();
        f1.erase();

        Figure f2 = new Circle2();
        f2.draw();
        f2.erase();
    }
}
