package Collections;
import java.util.*;

class Program11 {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.add(10);
        dq.add(20);
        dq.remove();

        for(int i : dq) {
            System.out.println(i);
        }
    }
}
