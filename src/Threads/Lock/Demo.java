package Threads.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class Demo {
    public static void main(String[] args) throws Exception {
        BankAccount bank = new BankAccount();
        Thread t1 = new Thread(() ->{
            bank.withdrawn(6000);
        });
        Thread t2 = new Thread(() ->{
            bank.withdrawn(3000);
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Current Balance" + bank.balance);
    }
    
}
class BankAccount{
    int balance = 5000;
    Lock lock = new ReentrantLock();
    void withdrawn(int amount){
        lock.lock();
        try{
            if(amount> balance){
            System.out.println("Insufficient Balance");
            return;
        }
            System.out.println("Withdrawn Started");
            balance = balance - amount;
            Thread.sleep(1000);
             System.out.println("Withdrawn Complete");
        }catch(Exception e){
           e.printStackTrace();
        }
            finally{
              lock.unlock();
        }

    }
}
