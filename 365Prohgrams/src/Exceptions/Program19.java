package Exceptions;
import java.util.regex.*;

class Program19 {
    public static void main(String[] args) {
        try {
            Pattern.compile("[");
        } catch (PatternSyntaxException e) {
            System.out.println("Pattern syntax error");
        }
    }
}
