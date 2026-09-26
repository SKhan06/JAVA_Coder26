package Threads;

public class Demo3 {
    public static void main(String [] args){
        Thread mainThread = Thread.currentThread();
        Thread t1 = new Thread(()->{
            System.out.println("Name of current thread is : " + Thread.currentThread().getName());
             System.out.println("Name of Main thread is : " + mainThread.getName());


        });
         System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        
        try {
            t1.sleep(3000);
        } catch (Exception e) {
        }
        System.out.println(t1.getState());
    }
    
}
