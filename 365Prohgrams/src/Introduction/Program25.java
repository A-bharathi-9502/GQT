package Introduction;
import java.util.*;
public class Program25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the base ");
	        int base = sc.nextInt();
	        System.out.println("enter the exponent");
	        int exp = sc.nextInt();
	        long result = 1;
	        for (int i = 1; i <= exp; i++) {
	            result *= base;
	        }
	        System.out.println("Result = " + result);

	}

}
