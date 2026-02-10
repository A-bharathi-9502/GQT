package Interfaces;
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Program3 implements Swimmable {
    public void swim() {
        System.out.println("Fish is swimming");
    }

    public static void main(String[] args) {
        Bird b = new Bird();
        Program3 f = new Program3();
        b.fly();
        f.swim();
    }
}
