package Introduction;
//program to find factorial of a number
import java.util.*;
public class Program5 {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        System.out.println("factorial of "+n+" is "+ factorial(n));
    }
    public static int  factorial(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

}
