package Collections;
import java.util.concurrent.*;
import java.util.*;

class MyDelay implements Delayed {
    long time;

    MyDelay(long delay) {
        time = System.currentTimeMillis() + delay;
    }

    public long getDelay(TimeUnit unit) {
        return unit.convert(time - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public int compareTo(Delayed d) {
        return Long.compare(this.time, ((MyDelay)d).time);
    }
}

class Program24 {
    public static void main(String[] args) throws Exception {
        DelayQueue<MyDelay> dq = new DelayQueue<>();
        dq.add(new MyDelay(1000));

        System.out.println("Element retrieved: " + dq.take());
    }
}
