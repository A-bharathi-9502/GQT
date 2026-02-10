package Introduction;
import java.util.*;
public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String str = s.nextLine();
	        HashMap<Character, Integer> map = new HashMap<>();
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            if (map.containsKey(ch)) {
	                map.put(ch, map.get(ch) + 1);
	            } else {
	                map.put(ch, 1);
	            }
	        }
	        for (char ch : map.keySet()) {
	            System.out.println("No of occurrences of " + ch + " is " + map.get(ch));
	        }

	}

}
