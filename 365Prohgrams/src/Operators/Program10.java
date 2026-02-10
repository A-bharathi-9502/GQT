package Operators;
import java.util.*;
public class Program10 {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter three numbers ");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a+" is greater ");
            }
            else{
                System.out.println(c+" is greater ");
            }
        }
        else if(b>c){
            System.out.println(b+" is greater ");
        }
        else{
            System.out.println(c+" is greater ");
        }
    }
}
