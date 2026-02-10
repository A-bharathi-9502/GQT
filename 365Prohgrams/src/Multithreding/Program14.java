package Multithreding;
class Program14 {
    volatile boolean flag = true;

    public static void main(String[] args) throws Exception {
        Program14 v = new Program14();

        new Thread(() -> {
            while(v.flag){}
            System.out.println("Stopped");
        }).start();

        Thread.sleep(1000);
        v.flag = false;
    }
}
