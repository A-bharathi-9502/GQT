package Operators;
import java.util.*;
public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("Enetr a number ");
        int n=s.nextInt();
        System.out.println("Factorial of "+n+" is  : "+Factorial(n));
    }
    static int Factorial(int n){
        if(n<=1){
            return 1;
        }
        else{
           return  n*Factorial(n-1);
        }

	}

}
