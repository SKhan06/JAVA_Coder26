package Generics;

public class Demo4 {
    public static void main(String []args){
        Integer i = getResult(10);
        printPair("Sohail",21);
        // Type inference
        System.out.println(i);

    }

    public static <T> T getResult(T x){// Type Parameter
        return x;
    }
    public static <T, U> void printPair(T first ,U second){
        System.out.println(first +" " + second);
    }
    
}
// Generics Method
//<T> returntype methodName (T parameter);
