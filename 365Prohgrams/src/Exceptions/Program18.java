package Exceptions;
import java.time.*;
import java.time.format.*;

class Program18 {
    public static void main(String[] args) {
        try {
            LocalDate.parse("abc");
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format");
        }
    }
}
