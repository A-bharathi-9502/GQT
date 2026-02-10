package StringPrograms;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.next();
		char c='@';
		String temp="";
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				temp=temp+c;
			}
			else {
				temp=temp+str.charAt(i);
			}
		}
		System.out.println("String is "+temp);
	}

}
