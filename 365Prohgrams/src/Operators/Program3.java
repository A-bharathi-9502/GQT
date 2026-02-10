package Operators;
import java.util.*;
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        if(n>0){
            System.out.println("Positive Number");
        }
        else if(n<0){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("Zero");
        }
	}

}
