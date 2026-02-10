package Operators;
import java.util.*;
public class Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
                    System.out.print(Fib(i)+" ");

        }
    }
    static int Fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        else{
            return Fib(n-1)+Fib(n-2);
        }
    
}


	}


