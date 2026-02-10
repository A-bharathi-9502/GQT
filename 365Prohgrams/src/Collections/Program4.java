package Collections;
import java.util.*;

class Program4 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(20);
        set.remove(10);

        for(int i : set) {
            System.out.println(i);
        }
    }
}
