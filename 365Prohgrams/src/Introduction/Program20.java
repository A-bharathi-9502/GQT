package Introduction;
import java.util.*;
public class Program20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter radius");
        double r = s.nextDouble();
       double pi = 3.14159;
       double area = pi * r * r;
       double perimeter = 2 * pi * r;
       System.out.println("Area of Circle = " + area);
       System.out.println("Perimeter of Circle = " + perimeter);

	}

}
