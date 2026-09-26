package Threads.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Demo2 {
    public static void main(String[] args) throws Exception {
        Product p = new  Product();
        Thread t1 = new Thread(() -> {
            p.read();
        });
        Thread t2 = new Thread(() -> {
            p.read();
        });
        Thread t3 = new Thread(() -> {
            p.write(2000);
        });

         Thread t4 = new Thread(() -> {
            p.write(3000);
        });
         Thread t5 = new Thread(() -> {
            p.write(4000);
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        System.out.println(p.prize);
    }
}

class Product{
    volatile int prize = 500;
    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    void read(){
    lock.readLock().lock();
    try {
        int currentPrize = prize;
        System.out.println("Prize: " + currentPrize);
    } finally{
        lock.readLock().unlock();
    } 
    }
    void write(int prize){
    lock.writeLock().lock();
    try {
        System.out.println("Update Prize: " + prize);
        this.prize =prize;
    } finally{
        lock.writeLock().unlock();
    } 
    }
}
