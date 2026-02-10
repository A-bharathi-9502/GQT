package Multithreding;
import java.util.concurrent.*;

public class Program19 {
    public static void main(String[] args) {
        Phaser p = new Phaser(2);

        new Thread(() -> {
            System.out.println("Thread 1");
            p.arrive();
        }).start();

        new Thread(() -> {
            System.out.println("Thread 2");
            p.arrive();
        }).start();
    }
}
