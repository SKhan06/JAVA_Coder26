package Threads;

public class Main {
    public static void main(String[] args) throws Exception {
        Bank b = new Bank();
        Thread t1 = new Thread(() ->{
             b.deposit(500);
        });
        Thread t2 = new Thread(() ->{
             b.deposit(1200);
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(b.balance);
    }
    
}

class Bank{
    int balance = 1000;
    Object depositLock = new Object();
    Object withDrawnLock = new Object();
    void deposit(int amount){
        synchronized (depositLock) {
            System.out.println(Thread.currentThread().getName()+" deposite started");
            balance = balance +amount;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" deposit Finished");
        }
    }
    void withdrawn(int amount){
        synchronized (withDrawnLock) {
            System.out.println(Thread.currentThread().getName()+" withdrawn started");
            balance = balance -amount;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" Withdrawn Finished");
        }
    }


}
