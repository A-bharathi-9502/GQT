package Operators;
import java.util.*;
public class Program17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("enter a string");
        String st=s.nextLine();
        System.out.println("Reversed string is "+stringReverse(st));


    }
    static String stringReverse(String str){
        if(str.isEmpty()){
            return str;
        }
        else{
            return stringReverse(str.substring(1))+str.charAt(0);
        }

	}

}
