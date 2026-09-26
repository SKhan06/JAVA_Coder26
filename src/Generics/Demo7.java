package Generics;
import java.util.List;
import java.util.ArrayList;

public class Demo7 {
    public static void main(String [] args){
        // List<Dog> dogs = new ArrayList<>();
        // List<Animal> animals = dogs;

        Dog[] dogs = new Dog[10];
        Animal[] animals = dogs;
        animals[0]= new Dog();
        animals[1]= new Dog();
        animals[2]= new Dog();
        animals[3]= new Dog();
        animals[4]= new Dog();
        animals[5]= new Dog();
        for(Animal animal:animals){
            if(animal == null){
                continue;
            }
            animal.eat();
        }

    }
    
}

class Animal{
    void eat(){
        System.out.println("Eating");
    }
    void walk(){
        System.out.println("walking");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Boww Boww Boww");
    }
}
