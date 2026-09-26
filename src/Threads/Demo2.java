package Threads;

public class Demo2 {
     public static void main(String[]args){
     Thread t1 = new Thread(() -> {
         for(int i = 1; i<=100;i++){
            if(i %2 ==0){
                System.out.println("T1 : " + i);
            }
        }
     });
     Thread t2 = new Thread(() -> {
         for(int i = 1; i<=100;i++){
            if(i %2 !=0){
                System.out.println("T2 : " + i);
            }
        }
     });
     t1.start();
     t2.start();
}       
}

class Mythread implements  Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
}
    

