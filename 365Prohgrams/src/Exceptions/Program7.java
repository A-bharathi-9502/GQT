package Exceptions;
class Program7 {
    public static void main(String[] args) {
        try {
            Class.forName("Test");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}
