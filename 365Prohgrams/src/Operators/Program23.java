package Operators;
import java.util.*;
public class Program23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("enter pricipal amount, year and rate");
        int a=s.nextInt();
        int y=s.nextInt();
        int r=s.nextInt();
        double SI=(a*y*r)/100;
        System.out.println("simple interest "+SI);

	}

}
