package Threads.LockConcurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Demo2 {
    public static void main(String[] args) {
        LikeCounter c = new LikeCounter();
        Thread t1 = new Thread(() ->{
            for(int i= 1 ; i<=10 ;i++){
                c.like();
            }
        });
        Thread t2 = new Thread(() ->{
            for(int i= 1 ; i<=10 ;i++){
                c.like();
            }
        });

        Thread t3 = new Thread(() ->{
            for(int i= 1 ; i<=10 ;i++){
                c.like();
            }
        });
        Thread t4 = new Thread(() ->{
            for(int i= 1 ; i<=10 ;i++){
                c.like();
            }
        });
        Thread t5 = new Thread(() ->{
            for(int i= 1 ; i<=10 ;i++){
                c.like();
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        System.out.println(c.getTotal());
    }
    
}

class LikeCounter{
    // AtomicReference<Integer> totalCount = new AtomicReference<>(0);
    AtomicInteger totalCount = new AtomicInteger(0);
    public void like(){
        totalCount.getAndIncrement();
    // Integer currentCount;
    // Integer finalCount;
    // while(true){
    //     currentCount = totalCount.get();

    //     finalCount = currentCount+1;
    //     if(totalCount.compareAndSet(currentCount, finalCount)){
    //         return;
    //     }
    //     System.out.println("Conflict detected . Re-trying...");
    // }   
}
public int getTotal(){
    return totalCount.get();
}
     
}
