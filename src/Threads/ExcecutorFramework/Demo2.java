package ExcecutorFramework;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;

public  class Demo2{
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
            2,
            5,
            10
            ,TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(5));
            for(int i =1 ; i<=5 ;i++){
        int term = i;
        executor.execute(()->{
            System.out.println("Task " + term + "produced by " + Thread.currentThread().getName());
            try{
            Thread.sleep(2000);
        }catch(Exception e){
            
        }
        });
    }
    executor.shutdown();


    ScheduledExecutorService schedule= Executors.newScheduledThreadPool(2);
    ScheduledFuture<?>future = schedule.scheduleAtFixedRate(() ->{
        System.out.println("Task running");
    },2,2,TimeUnit.SECONDS);
    try{
        Thread.sleep(3000);
    }catch(Exception e){}
    schedule.shutdown();


 }
}
