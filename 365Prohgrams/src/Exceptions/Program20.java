package Exceptions;
import java.util.*;

class Program20 {
    public static void main(String[] args) {
        try {
            ResourceBundle.getBundle("test");
        } catch (MissingResourceException e) {
            System.out.println("Resource missing");
        }
    }
}
