package Operators;
import java.util.*;
public class Program15 {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter a base ");    
    int n=s.nextInt(); 
    System.out.println("enter exponent");
    int m=s.nextInt();
    System.out.println("Result  "+power(n,m));
    }
    static int power(int base,int exp){
        if(exp==0){
            return 1;
        }
        else{
            return base*power(base,exp-1);
        }
    }
    
}
