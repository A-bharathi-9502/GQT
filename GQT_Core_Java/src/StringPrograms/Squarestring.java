package StringPrograms;

import java.util.Scanner;

public class Squarestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.next();
		int sum=0;
		int product=1;
		int st=str.charAt(0);
		System.out.println();
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a'&&str.charAt(i)>='z') {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				
			sum=sum;
			}
			else {
				int sm=str.charAt(i);
				product*=st;
			}
			}
		}
		System.out.println("Sum of string is "+sum);
		int square=sum*sum;
		System.out.println("square of the sum is "+square);
		System.out.println("Produtc of consonants is "+product);
		System.out.println("Divident of product and sum is "+(product/sum));
		

	}

}
