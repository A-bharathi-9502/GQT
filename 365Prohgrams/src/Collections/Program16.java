package Collections;
import java.util.*;

class Program16 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("A");
        v.add("B");
        v.remove("A");

        for(String s : v) {
            System.out.println(s);
        }
    }
}
