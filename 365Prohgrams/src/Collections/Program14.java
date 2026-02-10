package Collections;
import java.util.*;

class Program14 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(1, "One");
        ht.put(2, "Two");

        System.out.println(ht.get(1));
    }
}
