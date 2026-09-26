package Threads.ExcecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {
    public static void main(String [] args){
        // execute -- Runnable
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for(int i=1; i<=5;i++){
            int term = i;
            executor.execute(() -> {     
                System.out.println("Task " +term +" is performed by " + Thread.currentThread().getName());
                 });
            }
            executor.shutdown();
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
            // Submit -- Callable
             ExecutorService executor1 = Executors.newFixedThreadPool(1);
            Future<Integer> f = executor1.submit(() -> 10 );    
             
            try {
                System.out.println(f.get()); 
            } catch (Exception e) {
            }
            
            executor1.shutdown();
        
            
       
    }
    
}
