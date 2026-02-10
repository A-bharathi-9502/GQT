package StringPrograms;

import java.util.Scanner;

public class Sumofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.next();
		int sum=0;
		for(int i=0;i<str.length();i++) {
			sum+=str.charAt(i);
		}
		System.out.println("Sum of string is "+sum);
	}

}
