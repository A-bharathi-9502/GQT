package Multithreding;
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
}

public class Program1 {
    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
    }
}
