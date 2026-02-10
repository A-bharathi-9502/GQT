package Operators;
import java.util.*;
public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter 2 values ");
	    int n=s.nextInt();
	    int m=s.nextInt();
	    System.out.println("Before swap: n = " + n + ", m = " + m);
	    n=n^m;
	    m=n^m;
	    n=n^m;
	    System.out.println("n = "+n+" m = "+m);


	}

}
