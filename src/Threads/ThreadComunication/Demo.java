package Threads.ThreadComunication;

public class Demo {
    public static void main(String[] args) {
        Box box = new Box();
        Thread t1 = new Thread(() -> {
            try{
               for(int i = 1 ; i<20 ; i++){
                   box.producer(i);
            }
            
            }catch(Exception e){

            }
            
        });
        Thread t2 = new Thread(() -> {
            try{
               for(int i = 1 ; i<20 ; i++){
                   box.consumer();
            }
            
            }catch(Exception e){

            }
        });

        t1.start();
        t2.start();
    }
    
}

class Box{
    volatile Integer item;
    volatile Boolean flag = false;
    synchronized  void producer(int value) throws Exception{
        while (flag == true) {
            wait(); 
        }
        item = value;
        flag = true;
        System.out.println("Producer produce " +    item);
        notify();
    }
    synchronized void consumer()throws Exception{
        while (flag == false) { 
            wait();
        }
        System.out.println("Consumer consume " + item);
        item = null;
        flag = false;
        notify();  
    }
}
