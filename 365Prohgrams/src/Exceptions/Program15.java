package Exceptions;
import java.util.*;

class Program15 {
    public static void main(String[] args) {
        try {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            for(Integer i : list) {
                list.add(2);
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Concurrent modification");
        }
    }
}
