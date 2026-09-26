package Threads.LockConcurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo {
    public static void main(String[] args) {
        Counter c = new Counter();
        Thread t1 = new Thread(()->{
            for(int i=1; i<=10000;i++){
                c.increment();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=1; i<=10000;i++){
                 c.increment();
            }
        });

        t1.start();
        t2.start();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        System.out.println(c.count);
    }
    
}

class Counter{
    AtomicInteger count = new AtomicInteger();
    void increment(){
        count.getAndIncrement();
    }
}
