package Exceptions;
class Program8 {
    static void display() {
        display();
    }
    public static void main(String[] args) {
        try {
            display();
        } catch (StackOverflowError e) {
            System.out.println("Stack overflow error");
        }
    }
}
