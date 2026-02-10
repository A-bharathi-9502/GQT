package Arrays;
import java.util.*;
public class Arraycode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter student count: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("enter marks of student no "+(i+1)+"  ");
			arr[i]=s.nextInt();
		}
		System.out.println("-----------------------------");
		for(int i=0;i<n;i++) {
			System.out.println("The marks of student no: "+arr[i]);
		}

	}

}
