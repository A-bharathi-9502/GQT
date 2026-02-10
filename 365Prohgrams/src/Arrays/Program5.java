package Arrays;
import java.util.*;
public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
       System.out.println("Enter array size ");
       int n=s.nextInt();
       int array[] = new int[n]; 
       System.out.println("Enter array elements"); 
       for(int i = 0; i < n; i++){ 
           array[i] = s.nextInt(); 
            
       } 
       for(int i=0;i<n/2;i++){
           int t=array[i];
           array[i]=array[n-1-i];
           array[n-1-i]=t;
       }
       System.out.println("Array after reversing ");
        for(int i = 0; i < n; i++){ 
           System.out.print(array[i]+" "); 
            
       } 

	}

}
