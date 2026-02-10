package Arrays;
import java.util.*;
public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); 
        System.out.println("Enter array size"); 
        int n = s.nextInt(); 
        int array[] = new int[n]; 
        System.out.println("Enter array elements"); 
        for(int i = 0; i < n; i++){ 
            array[i] = s.nextInt(); 
        } 
        int u[]=Arrays.stream(array).distinct().toArray();
        for(int i=0;i<u.length;i++){
            System.out.print(u[i]+" ");
        }
	}

}
