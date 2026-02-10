package StringPrograms;

import java.util.Scanner;

public class CountVC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.next();
		int v_c=0;
		int c_c=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				v_c++;
			}
			else {
				c_c++;
			}
		}
	
		}
		System.out.println("Vowels "+v_c);
		System.out.println("Consonants "+c_c);

	}

}
