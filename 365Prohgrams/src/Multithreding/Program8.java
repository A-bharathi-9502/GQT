package Multithreding;
class Program8 {
    static ThreadLocal<Integer> tl = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {
        Runnable r = () -> {
            tl.set((int)(Math.random()*100));
            System.out.println(Thread.currentThread().getName() + " value: " + tl.get());
        };
        new Thread(r).start();
        new Thread(r).start();
    }
}
