package Multithreding;
class Program5 extends Thread {
    public void run() {
        System.out.println(getName() + " running");
    }
    public static void main(String[] args) throws Exception {
    	Program5 t1 = new Program5();
    	Program5 t2 = new Program5();

        t1.start();
        t1.join();
        t2.start();
    }
}
