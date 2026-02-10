package Arrays;
import java.util.*;
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
        
        System.out.println("Enter array size");
        int n = s.nextInt(); 
        
        int array[] = new int[n];
        int sum = 0;

        System.out.println("Enter array elements");
        for(int i = 0; i < n; i++){
            array[i] = s.nextInt();
            sum = sum + array[i];
        }

        System.out.println("Sum = " + sum);
		
		

	}

}
