package Exceptions;
class Program11 {
    public static void main(String[] args) {
        try {
            Object[] arr = new Integer[5];
            arr[0] = "Hello";
        } catch (ArrayStoreException e) {
            System.out.println("Invalid array store");
        }
    }
}
