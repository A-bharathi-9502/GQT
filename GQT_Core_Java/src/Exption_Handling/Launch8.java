package Exption_Handling;

import java.util.*;

class Program1{
	Scanner s=new Scanner(System.in)	;		
	void function1() throws InputMismatchException,ArrayIndexOutOfBoundsException,NegativeArraySizeException, Exception{
		System.out.println("function-1 started");

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
		System.out.println("function-1 completed");


	}
}
class Program2 {
	Program1 p1=new Program1();
	void function2() throws Exception{
		System.out.println("function-3 started");

		p1.function1();
		System.out.println("function-2 completed");

	}

}
class Program3{
	
	Program2 p2=new Program2();
	void function3() {
		System.out.println("function-3 started");
		try {
			p2.function2();
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
		System.out.println("function-3 started");

	}

}

public class Launch8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main stated");
		Program3 p3=new Program3();
		p3.function3();
		System.out.println("main completed");

	}

}
