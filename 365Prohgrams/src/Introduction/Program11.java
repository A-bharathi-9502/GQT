package Introduction;
import java.util.*;
public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string ");
        String str=s.nextLine();
        String temp=str;
        StringBuffer st=new StringBuffer(str);
        st.reverse();
        String sb=st.toString();
        System.out.println("Reversed string "+sb);
        if(sb.equals(temp)){
            System.out.println("This string is palindrome");
        }
        else{
            System.out.println("This string is not pallindrome");
        }

	}

}
