package Multithreding;
class Program3 extends Thread {
    public void run() {
        System.out.println(getName() + " Priority: " + getPriority());
    }
    public static void main(String[] args) {
        Program3 t1 = new Program3();
        Program3 t2 = new Program3();

        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
