package Collections;
import java.util.concurrent.*;

class Program21 {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> q = new LinkedBlockingQueue<>();

        q.add(10);
        q.add(20);
        q.remove();

        for(int i : q) {
            System.out.println(i);
        }
    }
}
