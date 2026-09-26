package Generics;
import java.util.List;
import java.util.ArrayList;

public class Demo8 {
    public static void main(String [] args){
        // List<Animal> animals = new ArrayList<>();
        // animals.add(new Animal());
        // animals.add(new Animal());
        // animals.add(new Animal());

         List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        fun(dogs);
    }

    static void fun(List<?> value){
        for(Object  obj : value){
            System.out.println(obj.getClass().getName());
        }
    }
    
}

class Animal{
    void eat(){
        System.out.println("Eating");
    }
    void walk(){
        System.out.println("Walking");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Boww Boww Boww");
    }
}
