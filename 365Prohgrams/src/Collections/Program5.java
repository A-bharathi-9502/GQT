package Collections;
import java.util.*;

class Program5 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");

        System.out.println(map.get(1));
        System.out.println(map.get(2));
    }
}
