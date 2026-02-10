package Arrays;
import java.util.*;
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	        System.out.println("Enter array size ");
	        int n=s.nextInt();
	        int array[] = new int[n]; 
	       
	         System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            array[i] = s.nextInt();
	        }
	         int largest = array[0];
	        for (int i = 1; i < n; i++) {
	            if (array[i] > largest) {
	                largest = array[i];
	            }
	        }
	        System.out.println("Largest: " + largest);

	        // Smallest element
	        int smallest = array[0];
	        for (int i = 1; i < n; i++) {
	            if (array[i] < smallest) {
	                smallest = array[i];
	            }
	        }
	        System.out.println("Smallest: " + smallest);

	}

}
