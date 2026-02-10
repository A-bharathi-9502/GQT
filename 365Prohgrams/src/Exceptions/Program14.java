package Exceptions;
import java.util.*;

class Program14 {
    public static void main(String[] args) {
        try {
            List<Integer> list = List.of(1,2,3);
            list.add(4);
        } catch (UnsupportedOperationException e) {
            System.out.println("Operation not supported");
        }
    }
}
