package Threads;

public class Demo1 {
    public static void main(String[]args){
     Thread t = new Thread(() ->{
        System.out.println("Thread is running");
        System.out.println(Thread.currentThread().getName());
     });
     t.start();
}    
    
}

// class Mythread implements  Runnable{
//     public void run(){
//         System.out.println("Thread is running");
//     }
// }

