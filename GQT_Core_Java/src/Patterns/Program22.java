package Patterns;

import java.util.Scanner;

public class Program22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("- ");
			}
			for(int l=1;l<=n;l++) {
				System.out.print("& ");
			}
			for(int m=1;m<=i;m++) {
				System.out.print("% ");
			}
			System.out.println();
		}

	}

}
