//Sum of digits of a number
import java.util.*;
class DigitsSum{
public static void main(String arg[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter a number");
    int n=s.nextInt();
    int sum=0;
    while(n>0){
        sum=sum+(n%10);
        n=n/10;
    }
    System.out.println(sum);
}
}