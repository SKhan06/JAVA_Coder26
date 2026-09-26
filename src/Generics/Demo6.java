package Generics;

public class Demo6 {
    public static void main(String [] args ){
    Box<Fish> f = new Box<Fish>();
    f.value = new Fish();
    f.value.swim();  
}
}

class Box <T extends Animal & Swimmable>{
    T value;

}

class Animal{
    void display(){
        System.out.println("Displaying Animal");
    }
}

interface Swimmable{
    void swim();
}

class Dog extends Animal{

}
class Fish extends Animal implements Swimmable{
    public  void swim(){
        System.out.println("swimming");
    }

}
