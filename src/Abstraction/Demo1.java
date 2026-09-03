package Abstraction;

public class Demo1 {
    public static void main(String [] args){
        Car c = new fuelCar();
        c.start();
        c.accelarate();
        c.stop();
        Car c1 = new ElectricCar();
        c1.start();
        c1.accelarate();
        c1.stop();
    }
    
}

abstract class Car{
    void start(){
        System.out.println("Car is starting");
    }
   abstract void accelarate();
   abstract void stop();
}
class fuelCar extends Car{
    void accelarate(){
        System.out.println("Fuel car is accelerating");
    }
    void stop(){
        System.out.println("Fuel car is stopping");
    }
}
 class ElectricCar extends Car{
    void accelarate(){
        System.out.println("Electric car is accelerating");
    }
    void stop(){
        System.out.println("Electric car is stopping");
    }
 }