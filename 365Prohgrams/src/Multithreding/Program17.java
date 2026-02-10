package Multithreding;
import java.util.concurrent.*;

public class Program17 {
    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newSingleThreadExecutor();

        Future<Integer> f = es.submit(() -> 10 + 20);
        System.out.println(f.get());

        es.shutdown();
    }
}
