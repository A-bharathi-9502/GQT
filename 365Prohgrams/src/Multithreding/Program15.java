package Multithreding;
import java.util.concurrent.*;

public class Program15 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        es.submit(() -> System.out.println("Executor task"));
        es.shutdown();
    }
}
