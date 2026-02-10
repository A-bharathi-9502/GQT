package Multithreding;

import java.util.concurrent.locks.*;

public class Program26 {
    static Lock lock = new ReentrantLock();
    static Condition cond = lock.newCondition();

    public static void main(String[] args) {
        new Thread(() -> {
            lock.lock();
            try {
                cond.await();
                System.out.println("Resumed");
            } catch(Exception e){}
            finally { lock.unlock(); }
        }).start();

        new Thread(() -> {
            lock.lock();
            try {
                cond.signal();
            } finally { lock.unlock(); }
        }).start();
    }
}
