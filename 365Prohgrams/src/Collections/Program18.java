package Collections;
import java.util.*;

class Program18 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");

        ListIterator<String> it = list.listIterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
