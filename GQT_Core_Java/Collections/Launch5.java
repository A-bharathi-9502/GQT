package Collections;
import java.util.*;
public class Launch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayDeque<Integer> deque = new ArrayDeque<>();
	        deque.add(10);
	        deque.add(20);
	        deque.add(30);
	        System.out.println("Initial deque: " + deque);
	        deque.addFirst(5);
	        System.out.println("After addFirst(5): " + deque);
	        deque.addLast(35);
	        System.out.println("After addLast(35): " + deque);
	        int removedFirst = deque.removeFirst();
	        int removedLast = deque.removeLast();
	        System.out.println("After removeFirst() -> " + removedFirst + ", removeLast() -> " + removedLast);
	        System.out.println("Deque now: " + deque);
	        System.out.println("First element: " + deque.peekFirst());
	        System.out.println("Last element: " + deque.peekLast());
	        deque.push(50);  
	        System.out.println("After push(50): " + deque);
	        int popped = deque.pop(); 
	        System.out.println("Popped element: " + popped);
	        System.out.println("Deque after pop: " + deque);


	}

}
