package Collections;
import java.util.HashSet;

public class Launch7 {

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(30);
        hs.add(20);
        hs.add(40);
        hs.add(10);  
        hs.add(null); 
        System.out.println("HashSet Elements:");
        System.out.println(hs);
        hs.remove(10);
        System.out.println(hs);

    }
}
