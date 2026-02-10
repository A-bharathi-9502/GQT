//program to perform AND OR XOR operations on two integers
import java.util.*;
public class Logical {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("a < b  && a > 0 : " + (a < b && a > 0));
        System.out.println("a > b  || b > 0 : " + (a > b || b > 0));
        System.out.println("!(a == b)      : " + !(a == b));
    }
}
