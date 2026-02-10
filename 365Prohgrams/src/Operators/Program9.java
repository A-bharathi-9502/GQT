package Operators;
import java.util.*;
public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
        String vowel="aeiouAEIOU";
        if(vowel.contains(String.valueOf(c))){
            System.out.println(c+" is a vowel");
        }
        else{
            System.out.println(c+" is a consonant");
        }


	}

}
