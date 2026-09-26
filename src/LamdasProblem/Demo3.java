package LamdasProblem;
import java.util.function.*;
class Demo3{
    public static void main(String []args){
        // Predicate
        Predicate<Integer> p = x -> x %2==0;
        System.out.println(p.test(2));
        //Output: true
        System.out.println(p.test(3));
        //Output: false
    }
}   
