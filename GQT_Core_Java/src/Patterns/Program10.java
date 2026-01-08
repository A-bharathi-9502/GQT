package Patterns;
import java.util.Scanner;

public class Program10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		int count=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(count+"  ");
				count++;
			}
			System.out.println();
		}
	}

}
