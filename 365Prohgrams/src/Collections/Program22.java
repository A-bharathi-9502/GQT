package Collections;
import java.util.concurrent.*;

class Program22 {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> q = new PriorityBlockingQueue<>();

        q.add(30);
        q.add(10);
        q.add(20);
        q.poll();

        for(int i : q) {
            System.out.println(i);
        }
    }
}
