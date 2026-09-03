package NestedClass;

public class Anonymous {
    public static void main(String[] args){
        Person p = new Person(){
            @Override
            public void introduce(){
                greet();
                System.out.println(" I am an anonymous class");
            }

        void greet(){
            System.out.println("Hello");
        }
        };
        p.introduce();
    
            
    
    }   
}
class Person{
    void introduce(){
        System.out.println("Hi, I am a person");
    }
}
