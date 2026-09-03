package Abstraction;

public class Demo2 {
    public static void main(String[] args){

        Animal a = new Dog();
        a.eat();
        a.sleep();
        a.sound(); 
    }
    
}

interface Animal{
    public void eat();
    public void sleep();
    public void sound();
}

class Dog implements Animal{
    public void eat(){
        System.out.println("Dog is eating");
    }
    public void sleep(){
        System.out.println("Dog is sleeping");
    }
    public void sound(){
        System.out.println("Dog barks");
    }
}

class Cat implements Animal{
    public void eat(){
        System.out.println("Cat is eating");
    }
    public void sleep(){
        System.out.println("Cat is sleeping");
    }
    public void sound(){
        System.out.println("Cat meows");
    }
}
