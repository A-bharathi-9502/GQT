package Arrays;

import java.util.Scanner;

public class Program3 {

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
	        int a2[]=new int[n];
	        for(int i=0;i<n;i++) {
	        	a2[i]=array[i];
	        }
	        System.out.println("Array2 elements are");
	        for(int i=0;i<n;i++) {
	        	System.out.print(a2[i]+" ");
	        }
	        }

}
