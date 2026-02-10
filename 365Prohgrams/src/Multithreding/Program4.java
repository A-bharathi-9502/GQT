package Multithreding;
import java.util.concurrent.*;

public class Program4 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);

        for(int i=1;i<=5;i++) {
            es.execute(() -> System.out.println("Task by " + Thread.currentThread().getName()));
        }
        es.shutdown();
    }
}
