package Collections;
import java.util.*;

class Program8 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.remove();

        for(int i : q) {
            System.out.println(i);
        }
    }
}
