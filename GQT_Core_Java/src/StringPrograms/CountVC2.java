package StringPrograms;

import java.util.Scanner;

public class CountVC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.next();
		int c_c=0;
		int s_c=0;
		String capital="AEIOU";
		String small="aeiou";
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)>='a'&&str.charAt(i)<='z')||str.charAt(i)>='A'&&str.charAt(i)<='Z') {
				if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
					c_c++;
				}
				else {
					if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
						s_c++;
					}
					
				}
			}
		}
		System.out.println("Capital vowels: "+c_c);
		System.out.println("Smaller Vowels: "+s_c);

	}

}
