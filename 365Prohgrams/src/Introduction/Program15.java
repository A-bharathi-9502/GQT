package Introduction;
import java.util.*;
public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	        System.out.println("enter number ");
	        int n=s.nextInt();
	        int sum=0;
	        while(n>0){
	            sum+=n%10;
	            n=n/10;
	        }
	        System.out.println("sum of the digits is "+sum);

	}

}
