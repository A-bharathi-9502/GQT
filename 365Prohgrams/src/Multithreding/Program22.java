package Multithreding;
import java.util.concurrent.*;

public class Program22 {
    public static void main(String[] args) {
        Exchanger<String> ex = new Exchanger<>();

        new Thread(() -> {
            try {
                System.out.println(ex.exchange("Hello"));
            } catch(Exception e){}
        }).start();

        new Thread(() -> {
            try {
                System.out.println(ex.exchange("World"));
            } catch(Exception e){}
        }).start();
    }
}
