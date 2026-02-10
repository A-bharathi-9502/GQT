package Operators;
import java.util.*;
public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("enter temperature in fahrenheit ");
        double t=s.nextDouble();
        double c=(t-32)*(5.0/9.0);
        System.out.println("temperature in celcius "+c);

	}

}
