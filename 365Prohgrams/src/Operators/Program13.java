package Operators;
import java.util.*;
public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	        System.out.println("Enter a number ");
	        int n=s.nextInt();
	        int count=0;
	        for(int i=1;i<=n;i++){
	            if(5%i==0){
	                count++;
	            }
	        }
	        if(count<=2){
	            System.out.println("It is a Prime number");
	        }
	        else{
	            System.out.println("It is not a prime number");
	        }

	}

}
