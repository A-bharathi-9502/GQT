package Operators;
import java.util.*;
public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        if((n%5==0) && (n%7==0)){
            System.out.println("Yes "+n+" divisible by both 5 and 7");
        }
        else{
            System.out.println("No "+n+" does not divisible by both 5 and 7");
        }

	}

}
