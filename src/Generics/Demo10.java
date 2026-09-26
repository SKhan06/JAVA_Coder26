package Generics;

import java.util.ArrayList;
import java.util.List;
//GEneric with lower bond (Super)

public class Demo10 { 
    public static void main(String [] args){
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        fun(animals);
    }
    static void fun(List<? super Animal> value){
        value.add(new Animal());
        value.add(new Dog());
        value.add(new Cat());

        for(Object obj : value){
            Animal a = (Animal) obj;
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
 class Cat extends Animal{

 }
