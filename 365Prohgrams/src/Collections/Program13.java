package Collections;
import java.util.*;

class Program13 {
    public static void main(String[] args) {
        BitSet bs = new BitSet();

        bs.set(1);
        bs.set(3);
        bs.clear(1);

        System.out.println(bs);
    }
}
