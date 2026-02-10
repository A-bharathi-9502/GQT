package Interfaces;
interface MyRunnable {
    void run();
}

interface MyCallable {
    void call();
}

class MyThread implements MyRunnable {
    public void run() {
        System.out.println("Thread running");
    }
}

class MyTask implements MyCallable {
    public void call() {
        System.out.println("Task executing");
    }
}

public class Program31 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        MyTask task = new MyTask();

        t.run();
        task.call();
    }
}
