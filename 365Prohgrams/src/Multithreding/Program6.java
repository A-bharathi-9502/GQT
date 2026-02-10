package Multithreding;
class Program6 {
    static final Object A = new Object();
    static final Object B = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized(A) {
                synchronized(B) {}
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized(B) {
                synchronized(A) {}
            }
        });

        t1.start();
        t2.start();
    }
}
