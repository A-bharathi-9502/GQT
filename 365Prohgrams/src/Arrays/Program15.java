package Arrays;
import java.util.*;
public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter size of array:");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.println("Enter element to search:");
	        int key = sc.nextInt();

	        int index = -1;

	        for (int i = 0; i < n; i++) {
	            if (arr[i] == key) {
	                index = i;
	                break;
	            }
	        }

	        if (index != -1) {
	            System.out.println("Element found at index: " + index);
	        } else {
	            System.out.println("Element not found in array");
	        }

	}

}
