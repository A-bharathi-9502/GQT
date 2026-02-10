package Exceptions;
import java.io.*;

class Program4 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
