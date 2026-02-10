package Collections;
import java.util.*;

class Program15 {
    public static void main(String[] args) {
        Properties p = new Properties();

        p.setProperty("username", "admin");
        p.setProperty("password", "123");

        System.out.println(p.getProperty("username"));
    }
}
