package Multithreding;
import java.util.concurrent.*;

public class Program20 {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(2, () -> System.out.println("Barrier reached"));

        new Thread(() -> { try { cb.await(); } catch(Exception e){} }).start();
        new Thread(() -> { try { cb.await(); } catch(Exception e){} }).start();
    }
}
