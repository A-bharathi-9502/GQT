package Multithreding;
class Program13 {
    static ThreadLocal<String> tl = new ThreadLocal<>();

    public static void main(String[] args) {
        new Thread(() -> {
            tl.set("A");
            System.out.println(tl.get());
        }).start();
    }
}
