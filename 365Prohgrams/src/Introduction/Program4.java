package Introduction;
import java.util.*;
public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number ");
        int a=s.nextInt();
        int count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
            if(count>2){       break;
            }            
        }
        if(count>2){
            System.out.print(a+" is not prime number");
        }
        else{
            System.out.println(a+" is prime number");
        }

	}

}
