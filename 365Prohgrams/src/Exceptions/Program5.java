package Exceptions;
class Program5 {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}
