package Introduction;
import java.util.*;
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int a = sc.nextInt();

        System.out.print("Enter b value: ");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


	}
	

}
