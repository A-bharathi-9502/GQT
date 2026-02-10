package Arrays;
import java.util.*;
public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner  s=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=s.nextInt();
        int array[]=new int[n];
        System.out.println("Enter elemnts");
        for (int i= 0; i<n; i++) {
            array[i]=s.nextInt();            
        }
        int f=Integer.MIN_VALUE;
        int sc=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(array[i]>f){
                sc=f;
                f=array[i];
            }
            else if(array[i]>sc && array[i]!=f){
                sc=array[i];
            }
        }
        System.out.println("Secnd Largest elemnt "+ sc);
	}

}
