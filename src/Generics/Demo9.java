package Generics;

import java.util.ArrayList;
import java.util.List;

public class Demo9 {public static void main(String [] args){
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());

         List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        fun(dogs);
    }

    static void fun(List<? extends Animal> value){
        for(Animal  a : value){
            a.eat();
            
        }
    }
    
}

class Animal{
    void eat(){
        System.out.println("Eating Animal");
    }
    void walk(){
        System.out.println("Walking");
    }
}

class Dog extends Animal{
      void eat(){
        System.out.println("Eating Dog");
    }

    void bark(){
        System.out.println("Boww Boww Boww");
    }
}
