package Introduction;
import java.util.*;
public class Program22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        System.out.println("enter array size");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        int sum = 0;
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	            sum += arr[i];
	        }
	        System.out.println("Sum of array = " + sum);

	}

}
