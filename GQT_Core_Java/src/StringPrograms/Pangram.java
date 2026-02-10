package StringPrograms;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.nextLine();
		char st[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};	
		str=str.toLowerCase();
		int t;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				t=str.charAt(i)-'a';
				st[t]=1;
			}
		}
		for(int i=0;i<st.length;i++) {
			if(st[i]!=1) {
				System.out.println("Not Pangram");
				System.exit(0);
			}
		}
		System.out.println("String is Pangram");
	}

}

