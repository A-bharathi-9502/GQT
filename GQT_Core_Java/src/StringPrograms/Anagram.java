package StringPrograms;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first string :");
		String str=s.next();
		System.out.println("Enter the Second string :");
		String str2=s.next();
		if(str.length()==str2.length()) {
			Arrayconv A=new Arrayconv();
			char[] st=A.convert(str);
			char[]st2=A.convert(str2);
			Arrays.sort(st);
			Arrays.sort(st2);
			for(int i=0;i<st.length;i++) {
				if(st[i]!=st2[i]) {
					System.out.println("The strings are not anagram ");
					System.exit(0);
				}
			}
			
				System.out.println("Strings are anagram");
			
			
		}
		else {
			System.out.println("The lengths are not equal");
		}
		
	}

}
class Arrayconv{
	char[] convert(String s) {
		char arr[]=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			arr[i]=s.charAt(i);
		}
		return arr;
	}
}
