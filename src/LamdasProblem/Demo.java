package LamdasProblem;
import java.util.function.*;
class Demo{
    public static void main(String []args){
        // Consumer
        Consumer<Integer> print = x -> System.out.println("Hello");
        print.accept(10);
        //Output: Hello

        Consumer<Integer> print2 = x -> System.out.println("Sohail");
        print2.accept(10);
        //Output: Sohail


        //Supplier
        Supplier<Integer> s = () -> 100;
        System.out.println(s.get());
        //Output: 100


        // Method Reference    
        Consumer<Integer> print3 = System.out::println;
        print3.accept(10);

        Consumer<Integer> print4 = Math::abs;
        print4.accept(-10);
        
    
    }
}   
