package Operators;
import java.util.*;
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter first integer:");
        int a = sc.nextInt();

        System.out.println("Enter second integer:");
        int b = sc.nextInt();

        int andResult = a & b;   // Bitwise AND
        int orResult  = a | b;   // Bitwise OR
        int xorResult = a ^ b;   // Bitwise XOR

        System.out.println("Bitwise AND (a & b) = " + andResult);
        System.out.println("Bitwise OR  (a | b) = " + orResult);
        System.out.println("Bitwise XOR (a ^ b) = " + xorResult);

	}

}
