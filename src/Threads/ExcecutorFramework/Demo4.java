package ExcecutorFramework;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Demo4{
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,9,6,7};
        ForkJoinPool pool = new ForkJoinPool();
        SumTask task = new SumTask(arr, 0, arr.length);
        int result = pool.invoke(task);
        System.out.println(result);
        pool.shutdown();
        
    }

}

class SumTask extends RecursiveTask<Integer>{
    int[] arr;
    int start;
    int end;
    public SumTask(int[] arr, int start, int end){
        this.arr = arr;
        this.start = start;
        this.end = end;
    }
    
    protected Integer compute(){

        //Basic logic 
        int sum = 0;
        if(end - start<= 2){   
            for(int i =start ; i<end;i++){
                sum += arr[i];
            }
            return  sum;
        }
        //main logic --> fork
        int mid = (start + end)/2;
        SumTask lefTask = new SumTask(arr, start, mid);
        SumTask righTask = new SumTask(arr, mid, end);
        lefTask.fork();
        int sum1 =righTask.compute();
        int sum2 = lefTask.join();
        return  sum1 + sum2;
    }
}