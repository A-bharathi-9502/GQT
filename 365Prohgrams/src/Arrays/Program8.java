package Arrays;
import java.util.*;
public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("Enter size of 2 arrays");
        int n=s.nextInt();
        int m=s.nextInt();
        int array[]=new int[n];
        System.out.println("Enter elements of array1");
        for(int i=0;i<n;i++){
            array[i]=s.nextInt();
        }
        int array2[]=new int[m];
        System.out.println("Enter elements of array2");
        for(int i=0;i<m;i++){
            array2[i]=s.nextInt();
        }
        int newarray[]=new int[n+m];
        System.arraycopy(array,0, newarray, 0, n);
        System.arraycopy(array2, 0, newarray, n, m);
        System.out.println("Resultant array is ");
        for(int i=0;i<newarray.length;i++){
            System.out.print(newarray[i]+" ");

        }

	}

}
