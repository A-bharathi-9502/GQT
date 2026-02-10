package Multithreding;
import java.util.concurrent.*;

public class Program18 {
    public static void main(String[] args) throws Exception {
        BlockingQueue<Integer> q = new ArrayBlockingQueue<>(1);

        new Thread(() -> {
            try { q.put(10); } catch(Exception e){}
        }).start();

        System.out.println(q.take());
    }
}
