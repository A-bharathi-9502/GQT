package Multithreding;
import java.util.concurrent.*;

public class Program25 {
    public static void main(String[] args) {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);

        ses.schedule(() -> System.out.println("Scheduled task"), 2, TimeUnit.SECONDS);
        ses.shutdown();
    }
}
