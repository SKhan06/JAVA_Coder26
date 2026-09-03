package Inerface;

public class Demo3 {
    public static void main(String [] args){
        Vehicle v = new Car();
        v.ride();
    }
    
}

// Default method, Static method, Private method

interface Vehicle{
   default void ride(){
        System.out.println("Vehicle is driving");
        accelerate();
    }

    static void mode(){
        System.out.println("Sport mode On");
    }
    
    private void accelerate(){
        System.out.println("Accelerate");
    }
}

class Car implements Vehicle{
    // public void ride(){
    //             System.out.println("Car is driving");
    // }
}