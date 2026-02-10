package Multithreding;
class Shared {
    synchronized void waitMethod() throws Exception {
        wait();
        System.out.println("Resumed");
    }
    synchronized void notifyMethod() {
        notify();
    }
}

public class Program12 {
    public static void main(String[] args) {
        Shared s = new Shared();

        new Thread(() -> {
            try { s.waitMethod(); } catch(Exception e){}
        }).start();

        new Thread(() -> {
            try { Thread.sleep(1000); s.notifyMethod(); } catch(Exception e){}
        }).start();
    }
}
