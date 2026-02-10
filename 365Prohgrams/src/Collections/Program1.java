package Collections;
import java.util.*;

class Program1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.remove("B");

        for(String s : list) {
            System.out.println(s);
        }
    }
}
