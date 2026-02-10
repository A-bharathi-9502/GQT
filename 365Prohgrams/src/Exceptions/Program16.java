package Exceptions;
class Program16 {
    static void check(int age) {
        if(age < 18)
            throw new IllegalArgumentException();
    }
    public static void main(String[] args) {
        try {
            check(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument");
        }
    }
}
