package StringPrograms;

import java.util.Scanner;

public class CorS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.next();
		int c_c=0;
		int s_c=0;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
				if(str.charAt(i)=='A') {
					
				}
			}
			else {
				if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
					s_c++;
				}
			}
		}

	}

}
