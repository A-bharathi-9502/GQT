package Introduction;
import java.util.*;
public class Program10 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a string ");
        String str=s.nextLine();
        StringBuffer st=new StringBuffer(str);
        st.reverse();
        String sb=st.toString();
        System.out.println("Reversed string "+sb);
    }

}
