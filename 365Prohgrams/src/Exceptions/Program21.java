package Exceptions;
import java.util.*;

class Program21 {
    public static void main(String[] args) {
        try {
            Formatter f = new Formatter();
            f.close();
            f.format("Hello");
        } catch (FormatterClosedException e) {
            System.out.println("Formatter closed");
        }
    }
}
