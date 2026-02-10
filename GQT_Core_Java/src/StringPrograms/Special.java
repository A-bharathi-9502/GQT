package StringPrograms;

import java.util.Scanner;

public class Special {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.next();
		char [] st=str.toCharArray();
		String num="";
		String al="";
		String sp="";
		for(int i=0;i<st.length;i++) {
			int c=st[i];
			if(c>=48&&c<=56) {
				num=num+st[i];
			}
			else if(c>=65&&c<=122) {
				al=al+st[i];
			}
			else {
				sp=sp+st[i];
			}
		}
		System.out.println("Alphabets are : "+al);
		System.out.println("Numbers are : "+num);
		System.out.println("Special characters are : "+sp);

	}

}
