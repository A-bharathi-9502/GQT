package Multithreding;
class Program7 extends Thread {
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
    public static void main(String[] args) {
        Program7 t = new Program7();
        t.start();
        t.interrupt();
    }
}
