package Threads.LockConcurrency;

import java.util.concurrent.atomic.AtomicReferenceArray;

public class Demo3 {

    public static void main(String[] args) {

        SeatManager manager = new SeatManager(2);

        Thread t1 = new Thread(() -> {
            manager.bookSeat("Sohail");
        });

        Thread t2 = new Thread(() -> {
            manager.bookSeat("Sahbaz");
        });

        t1.start();
        t2.start();
    }
}


class SeatManager {

    AtomicReferenceArray<String> seats;

    SeatManager(int numberOfSeats) {
        seats = new AtomicReferenceArray<>(numberOfSeats);
    }


    void bookSeat(String name) {

        while (true) {

            // Seat 0 check karo
            String current = seats.get(0);

            if (current == null) {

                // Agar Seat 0 abhi bhi empty hai
                if (seats.compareAndSet(0, null, name)) {

                    System.out.println(name + " got Seat 0");
                    return;
                }

                System.out.println(name + " conflict! Trying again...");
            }


            // Seat 1 check karo
            current = seats.get(1);

            if (current == null) {

                // Agar Seat 1 abhi bhi empty hai
                if (seats.compareAndSet(1, null, name)) {

                    System.out.println(name + " got Seat 1");
                    return;
                }

                System.out.println(name + " conflict! Trying again...");
            }
        }
    }
}