package Introduction;
import java.util.*;
public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter a number");
	        int n=s.nextInt();
	        int first=0;
	        int second=1;
	        System.out.print(first+" "+second+" ");
	        for(int i=1;i<=n-2;i++){
	            int next=first+second;
	            first=second;
	            second=next;
	            System.out.print(next+" ");
	        }
	        

	}

}
