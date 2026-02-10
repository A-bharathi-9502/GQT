package Exption_Handling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Launch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);

		try {
			System.out.println("Division operation");
			System.out.println("enter the first number ");
			int num=s.nextInt();
			System.out.println("enter the second number");
			int den=s.nextInt();
			int res=num/den;
			System.out.println("The result of division is "+res);
			System.out.println("--------------------------------");
			System.out.println("Array based operation");
			System.out.println("enter the array size");
			int n=s.nextInt();
			int arr[]=new int[n];
			System.out.println("enter the elemnt to be added");
			int a=s.nextInt();
			System.out.print("enter position");
			int pos=s.nextInt();
			arr[pos]=a;

		}
		catch(InputMismatchException e) {
			System.out.println("enter valid input");
		}
		catch(ArithmeticException e1) {
			System.out.println("divisible by zero not possible");
		}
		catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException e2) {
			System.out.println("Array size can not be negative");
		}

		catch(Exception e) {
			System.out.println("Exception handled");
		}
	}

}
