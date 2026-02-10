package Collections;
import java.util.concurrent.*;

class Program23 {
    public static void main(String[] args) throws Exception {
        SynchronousQueue<Integer> q = new SynchronousQueue<>();

        new Thread(() -> {
            try {
                q.put(10);
            } catch (Exception e) {}
        }).start();

        System.out.println(q.take());
    }
}
