package ExcecutorFramework;

import java.sql.Time;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Demo3{
    public static void main(String[] args) {
        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(()-> {
           System.out.println(Thread.currentThread().getName());
            return 10;})
                                      .thenApply(result -> result*3)
                                      .thenApply(result -> result*3);

        CompletableFuture<Void> f2 = CompletableFuture.supplyAsync(()-> 10)
                                      .thenApply(result -> result*2)
                                      .thenApply(result -> result*3)
                                      .thenAccept(result->System.out.println(result +" : "+ Thread.currentThread().getName()) );                          

        try{
            System.out.println(f1.get());
        }   catch(Exception e){}                           
    }
}

// thenApply not used the get() method
// thenApply is used the get() method