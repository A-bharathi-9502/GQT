package Multithreding;
import java.util.concurrent.*;

public class Program9 {
    public static void main(String[] args) throws Exception {
        CountDownLatch latch = new CountDownLatch(3);

        for(int i=1;i<=3;i++) {
            new Thread(() -> {
                System.out.println("Task done");
                latch.countDown();
            }).start();
        }

        latch.await();
        System.out.println("All threads completed");
    }
}
