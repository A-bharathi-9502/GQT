package Collections;
import java.util.*;

class Program3 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.remove(2);

        for(int i : set) {
            System.out.println(i);
        }
    }
}
