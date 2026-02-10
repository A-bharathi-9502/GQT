package Arrays;
import java.util.*;
public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s= new Scanner(System.in);
        System.out.println("enter array size");
        int n=s.nextInt();
        int array[]=new int[n];
        for (int i = 0; i <n; i++) {
            array[i]=s.nextInt();
        }
        for(int i=1;i<n;i++){
                if(array[i]<array[i-1]){
                   int t=array[i];
                   array[i]=array[i-1];
                   array[i-1]=t;
                }
        }
        System.out.println("Sorted array is ");
        for(int i=0;i<n;i++) {
        	System.out.print(array[i]+" ");
        }
        
	}

}
