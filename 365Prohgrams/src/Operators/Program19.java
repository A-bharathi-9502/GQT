package Operators;
import java.util.*;
public class Program19 {
	public static void main(String args[]) {
		 Scanner s=new Scanner(System.in);
	        System.out.println("Enter a year ");
	        int n=s.nextInt();
	        if((n%400==0)||((n%4==0)&&(n%100==0))){
	            System.out.println("Given year is leap year");
	        }
	        else{
	            System.out.println("Given year not q leap year");
	        }
	}

}
