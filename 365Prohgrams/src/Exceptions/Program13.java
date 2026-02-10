package Exceptions;
import java.util.*;

class Program13 {
    public static void main(String[] args) {
        try {
            Iterator<Integer> it = new ArrayList<Integer>().iterator();
            it.next();
        } catch (NoSuchElementException e) {
            System.out.println("No element found");
        }
    }
}
