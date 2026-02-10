package Collections;
import java.util.*;

class Program9 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.poll();

        for(int i : pq) {
            System.out.println(i);
        }
    }
}
