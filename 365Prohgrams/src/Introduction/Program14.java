package Introduction;
import java.util.*;
public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter a number ");
	        int num = sc.nextInt();

	        String binary = "";

	        while (num > 0) {
	            binary = (num % 2) + binary;
	            num = num / 2;
	        }

	        System.out.println("Binary = " + binary);
	}

}
