package Collections;
import java.util.*;
public class Launch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<Integer> ll = new LinkedList<Integer>();
	        ll.add(10);
	        ll.add(20);
	        ll.add(30);
	        System.out.println("Original list: " + ll);
	        ll.add(2, 35);
	        System.out.println("After adding 35 at index 2: " + ll);
	        LinkedList<Integer> ll1 = (LinkedList<Integer>) ll.clone();
	        ll.addAll(ll1);
	        System.out.println("After adding clone to original: " + ll);
	        ll.addFirst(5);
	        ll.addLast(50);
	        System.out.println("After addFirst and addLast: " + ll);

	        ll.removeFirst();
	        ll.removeLast();
	        System.out.println("After removeFirst and removeLast: " + ll);

	        System.out.println("First element: " + ll.getFirst());
	        System.out.println("Last element: " + ll.getLast());
	        System.out.println("Does list contain 35? " + ll.contains(35));
	        System.out.println("Index of 35: " + ll.indexOf(35));
	}

}
