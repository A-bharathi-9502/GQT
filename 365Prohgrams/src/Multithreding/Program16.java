package Multithreding;
public class Program16 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while(!Thread.currentThread().isInterrupted()) {}
            System.out.println("Interrupted");
        });
        t.start();
        t.interrupt();
    }
}
