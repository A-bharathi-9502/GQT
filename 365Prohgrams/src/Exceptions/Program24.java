package Exceptions;
import java.time.*;

class Program24 {
    public static void main(String[] args) {
        try {
            LocalDate.of(2025, 13, 10);
        } catch (DateTimeException e) {
            System.out.println("Invalid date time");
        }
    }
}
