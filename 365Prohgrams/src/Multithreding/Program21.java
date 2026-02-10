package Multithreding;
import java.util.concurrent.*;

public class Program21 {
    public static void main(String[] args) {
        Semaphore s = new Semaphore(1);

        new Thread(() -> {
            try {
                s.acquire();
                System.out.println("Accessed");
                s.release();
            } catch(Exception e){}
        }).start();
    }
}
