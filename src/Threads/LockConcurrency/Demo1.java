package Threads.LockConcurrency;

import java.util.concurrent.atomic.AtomicReference;

public class Demo1 {
    public static void main(String[] args) {
        SeatBooking s = new SeatBooking();
        Thread t1 = new Thread(()->{
            boolean value = s.bookSeat("Sohail");
            System.out.println("T1 say "+ value );
            
        });
        Thread t2 = new Thread(()->{
           boolean value =  s.bookSeat("Sahbaz");
           System.out.println("T2 say "+ value );
        });

        t1.start();
        t2.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(s.seat);
    }
    
}
class SeatBooking{
    AtomicReference<String> seat = new AtomicReference<>("EMPTY");
    boolean bookSeat( String name){
        String currentValue = seat.get();
        if(currentValue.equals("EMPTY") == false){
            return false;
        }

        return seat.compareAndSet("EMPTY", name);
    }
}