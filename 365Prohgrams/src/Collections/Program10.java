package Collections;
import java.util.*;

class Program10 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.pop();

        for(int i : stack) {
            System.out.println(i);
        }
    }
}
