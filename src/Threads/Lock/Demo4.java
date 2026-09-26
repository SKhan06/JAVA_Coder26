package Threads.Lock;
import java.util.concurrent.locks.StampedLock;
public class Demo4 {
    public static void main(String[] args)throws Exception{
         Product p = new  Product();
        Thread t1 = new Thread(() -> {
            p.readPrice();
        });
        Thread t2 = new Thread(() -> {
            p.readPrice();
        });
        Thread t3 = new Thread(() -> {
            p.updatePrice(2000);
        });
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
    }
   
}


class Product {

    private int price = 500;

    private final StampedLock lock = new StampedLock();

    void readPrice() {

        long stamp = lock.tryOptimisticRead();

        int currentPrice = price;

        if (lock.validate(stamp)) {
            System.out.println("Price = " + currentPrice);
        } else {
            System.out.println("Data changed during read");
        }
    }

    void updatePrice(int newPrice) {

        long stamp = lock.writeLock();

        try {
            price = newPrice;
        }
        finally {
            lock.unlockWrite(stamp);
        }
    }
}
