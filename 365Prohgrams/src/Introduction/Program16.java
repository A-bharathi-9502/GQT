package Introduction;
import java.util.*;
public class Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("enter year");
        int n=s.nextInt();
        if((n%400==0)||(n%4==0&&!(n%100==0))){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a leap year");
        }

	}

}
