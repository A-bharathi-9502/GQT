package Exceptions;
class Program1 {
    public static void main(String[] args) {
        try {
            int[] a = {1, 2, 3};
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
    }
}
