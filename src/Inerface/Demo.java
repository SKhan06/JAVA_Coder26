package Inerface;

public class Demo {
    public static void main(String [] args){
        Car c = new Bike();
        c.ride();
    }
    
}

interface Car{
    void ride();
}

class Bike implements Car{
    public void ride(){
        System.out.println("Sqwdwed");
    }

}
abstract class Scooty implements Car{
  abstract  public void ride();

}


// Multiple inheritance--> interface

interface Father{
    void fun();
}

interface Mother{
    void fun2();
}

class Child implements Father,Mother{
   public void fun(){

    }
   public void fun2(){

    }
}
