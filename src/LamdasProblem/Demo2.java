package LamdasProblem;
import java.util.function.*;
class Demo2{
    public static void main(String []args){
        //Function
        // Function<Integer,Integer> c = x -> x *x;
        // System.out.println(c.apply(3));
         //Output: 9

        //  Function<Integer,Integer> d = x -> x *2;
        // System.out.println(d.apply(5));
         //Output: 10

        // Function<Integer,Integer> e = x -> x +10;
        // System.out.println(e.apply(20));
        // //Output: 30
        // System.out.println(e.apply(5));
         //Output: 15

        // andThen() method
        // Function<Integer, Integer> add = x -> x+5;
        // Function<Integer, Integer> multiply = x -> x *2;
        // Function<Integer, Integer> result = add.andThen(multiply);
        // System.out.println(result.apply(10));
        // System.out.println(add.andThen(multiply).apply(10));
        //Output: 30

        // compose() method
        Function<Integer, Integer> add = x -> x+5;
        Function<Integer, Integer> multiply = x -> x *2;
        Function<Integer, Integer> result = add.compose(multiply);
        System.out.println(result.apply(10));


    }
}   
