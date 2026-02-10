package Multithreding;
import java.util.concurrent.*;

public class Program23 {
    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newFixedThreadPool(2);
        CompletionService<Integer> cs = new ExecutorCompletionService<>(es);

        cs.submit(() -> 5);
        cs.submit(() -> 10);

        System.out.println(cs.take().get());
        System.out.println(cs.take().get());

        es.shutdown();
    }
}
