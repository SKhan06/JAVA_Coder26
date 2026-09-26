package Threads.Lock;
import java.util.concurrent.locks.StampedLock;
public class Demo3 {
    public static void main(String[] args)throws Exception{
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
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println(p.prize);
    }
   
}

class Product{
    volatile int prize = 500;
    StampedLock lock = new StampedLock();
    void read(){
    long stamp = lock.readLock();
    try {
        int currentPrize = prize;
        System.out.println("Prize: " + currentPrize);
    } finally{
        lock.unlockRead(stamp);
        
    } 
    }
    void write(int prize){
    long stamp = lock.writeLock();
    try {
        System.out.println("Update Prize: " + prize);
        this.prize =prize;
    } finally{
        lock.unlockWrite(stamp);
      } 
    }
}

