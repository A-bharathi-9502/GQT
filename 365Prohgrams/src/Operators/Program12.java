package Operators;
import java.util.*;
public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s=new Scanner(System.in);
		  System.out.println("enter number ");
	         int n=s.nextInt();
	         int rev=pallindrome(n,0);
	         if(rev==n){
	            System.out.println("Pallindrome");
	         }
	         else{
	            System.out.println("not pallindrome");
	         }

	    
	    }
	    static int pallindrome(int n,int rev){
	        if (n == 0) return rev;
	        return pallindrome(n / 10, rev * 10 + (n % 10));
	    

	}

}
