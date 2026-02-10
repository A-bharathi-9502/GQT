package Collections;
import java.util.*;

class Program17 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);

        Enumeration<Integer> e = v.elements();
        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
