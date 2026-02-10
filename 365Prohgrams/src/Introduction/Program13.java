package Introduction;
import java.util.*;
public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	        System.out.println("Enter two numbers");
	        int n=s.nextInt();
	        int m=s.nextInt();
	        while (m!= 0) {
	            int temp = m;
	            m = n % m;
	            n = temp;
	        }

	        System.out.println("GCD = " + n);

	}

}
