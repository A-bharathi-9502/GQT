package Interfaces;
class Canvas implements Drawable {
    public void draw() {
        System.out.println("Drawing on canvas");
    }
}

class OfficePrinter implements Printable {
    public void print() {
        System.out.println("Printing from printer");
    }
}

public class Program29 {
    public static void main(String[] args) {
        Canvas c = new Canvas();
        OfficePrinter p = new OfficePrinter();

        c.draw();
        p.print();
    }
}
