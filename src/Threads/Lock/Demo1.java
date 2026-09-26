package Threads.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        BankAccount bank = new BankAccount();
        Thread t1 = new Thread(() ->{
            bank.withdrawn(2000);
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
   volatile int balance = 5000;
    Lock lock = new ReentrantLock();
    void withdrawn(int amount){
        if(lock.tryLock()){
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
        }else{
            System.out.println("Account is busy");
        }
        
            

    }
}


