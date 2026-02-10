package Collections;
import java.util.concurrent.*;

class Program25 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> q = new ConcurrentLinkedQueue<>();

        q.add(1);
        q.add(2);
        q.remove();

        for(int i : q) {
            System.out.println(i);
        }
    }
}
