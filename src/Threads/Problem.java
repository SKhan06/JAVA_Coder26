package Threads;

public class Problem {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(() ->{
            // for(int i=1; i<=10000;i++){
            //      c.increment();
            // }   
            try{
                Thread.sleep(1000);
            }catch(Exception e){
            }
            c.flag = true;
        });
        Thread t2 = new Thread(() ->{
            // for(int i=1; i<=10000;i++){
            //      c.increment();
            // }     
            while(!c.flag){
                System.out.println("Hello");

            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        // System.out.println(c.count);
    }
    
}

class Counter{
    static volatile boolean flag = false;
    public  volatile int count =0;
    synchronized  void increment(){
        count++;
    }
}

/*
Questions:

1. Expected output kya hona chahiye?--> 20000

2. Actual output kabhi expected se kam kyu aa sakta hai? -->beacuse of race condition

3. count++ ke andar kaun-kaun se steps hote hain? --> read,update,write

4. Isme race condition exactly kahan ho rahi hai?t1 or t2 se kyuki ye unatomic hai 

*/
