package Inheritance;

public class Demo {
    public static void main(String [] args){
        Dog d = new Dog();
        Animal a = new Animal();
        a=d; 
        a.run();
        d.burck();
        d.run();
    }
}

class Animal{
    public void run(){
        System.out.println("cfefijiofj");
    }

     public void walk(){
        System.out.println("dxdddddd");
    }
}

class Dog extends Animal{
    public void burck(){
        System.out.println("sdcdddd");
    }
}
