package StringPrograms;
import java.util.*;;
public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.next();
		
		String temp="";
		str=str.toLowerCase();
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
		
		}
		if(str.equals(temp)) {
			System.err.println("String is pallindrome");
		}
		else {
			
			System.out.println("String is not pallindrome");
		}
		

	}

}
