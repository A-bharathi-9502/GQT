package Exceptions;
class Program9 {
    public static void main(String[] args) {
        try {
            int[] a = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("Negative array size");
        }
    }
}
