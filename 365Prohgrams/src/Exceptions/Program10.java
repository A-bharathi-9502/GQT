package Exceptions;
class Program10 {
    public static void main(String[] args) {
        try {
            Thread.sleep(100);
            System.out.println("Thread woke up after 1 second");

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
