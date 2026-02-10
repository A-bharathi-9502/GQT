package Exceptions;
class Program17 {
    public static void main(String[] args) {
        try {
            throw new SecurityException();
        } catch (SecurityException e) {
            System.out.println("Security exception");
        }
    }
}
