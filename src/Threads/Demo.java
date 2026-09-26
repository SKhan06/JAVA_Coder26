package Threads;

class demo{
    public static void main(String []args){
        Mythread t1 = new Mythread();
       Thread r = new Thread(t1);
       r.start();
    }

}
class Mythread implements  Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
}
// class Mythread extends Thread{
//     public void run(){
//         System.out.println("Thread is running");
//     }
// }