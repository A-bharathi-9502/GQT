package StringPrograms;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.nextLine();
		int s_c=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				s_c=+1;
			}
		}
		int w_c=s_c+1;
		System.out.println("Word count: "+w_c);
		String t="";
		int cnt=0;
		String arr[]=new String[w_c];
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)==' ') {
				arr[cnt]=t;
				cnt++;
				t="";
			}
			else {
				t=t+str.charAt(i);
			}
		}
		arr[cnt]=t;
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+' ');
		}

	}

}
