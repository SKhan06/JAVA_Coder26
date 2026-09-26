package ExcecutorFramework;
 
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jdk.jshell.spi.ExecutionControl;
import java.util.concurrent.Future;

public class  Demo1{
    public static void main(String[] args) throws InterruptedException {
        ExecutorService execute = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> task = List.of(
            ()-> 10+20,
            ()-> 10,
            ()-> 30,
            ()-> 40);

       List<Future<Integer>> results = execute.invokeAll(task);
        for (Future<Integer> result : results) {
            try {
                System.out.println(result.get());
            } catch (Exception e) {
            }
    }
    execute.shutdown();
    }
}

// We can cannot catch the Exception in execute method 
// We can  catch the Exception in submit  method 
