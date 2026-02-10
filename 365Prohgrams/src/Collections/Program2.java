package Collections;
import java.util.*;

class Program2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(Integer.valueOf(20));

        for(int i : list) {
            System.out.println(i);
        }
    }
}
