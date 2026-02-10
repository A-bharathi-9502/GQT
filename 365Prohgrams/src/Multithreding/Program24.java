package Multithreding;
import java.util.concurrent.*;

public class Program24 {
    public static void main(String[] args) throws Exception {
        TransferQueue<Integer> tq = new LinkedTransferQueue<>();

        new Thread(() -> {
            try { tq.transfer(100); } catch(Exception e){}
        }).start();

        System.out.println(tq.take());
    }
}
