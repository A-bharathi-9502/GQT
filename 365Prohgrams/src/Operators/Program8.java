package Operators;
import java.util.*;
public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("enter pricipal amount, rate of interest, and time ");
        double p=s.nextDouble();
        double i=s.nextDouble();
        double t=s.nextDouble();
        double amount=p*Math.pow((1+(i/100)),t);
        double ci=amount-p;
        System.out.println("Compound interest "+ci);

	}

}
