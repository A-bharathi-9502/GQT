package Collections;
import java.util.concurrent.*;

class Program20 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> q = new ArrayBlockingQueue<>(3);

        q.add(1);
        q.add(2);
        q.remove();

        for(int i : q) {
            System.out.println(i);
        }
    }
}
