package Operators;
import java.util.*;
public class Program20 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int n=s.nextInt();
        int m=s.nextInt();
         int lcm = (n * m) / gcd(n, m);

        System.out.println("LCM = " + lcm);


    }
     static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}