package Collections;
import java.util.*;

class Program6 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "C");
        map.put(1, "Java");
        map.put(2, "Python");

        for(Map.Entry<Integer,String> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
