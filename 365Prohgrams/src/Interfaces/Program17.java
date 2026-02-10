package Interfaces;
interface Runnable {
    void run();
}

interface Walkable {
    void walk();
}

class Cheetah implements Runnable {
    public void run() {
        System.out.println("Cheetah is running fast");
    }
}

class Tortoise implements Walkable {
    public void walk() {
        System.out.println("Tortoise is walking slowly");
    }
}

public class Program17 {
    public static void main(String[] args) {
        Cheetah c = new Cheetah();
        Tortoise t = new Tortoise();

        c.run();
        t.walk();
    }
}
