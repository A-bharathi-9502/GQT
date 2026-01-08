package Patterns;

import java.util.Scanner;

public class Program16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int n=s.nextInt();
		int count=1;
		for(int i=0;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}

	}


}
