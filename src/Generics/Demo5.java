package Generics;

public class Demo5 {
    public static void main(String []args){
        Box<Integer> b = new Box<>();
        b.printDouble(22);
    }
}

// Generics -- T can be anything
// Bounds in generics
//Upper bond --> T is atleast number or it's subtype
class Box<T extends Number>{
    T value;
    public  void printDouble(T value){
        System.out.println(value.doubleValue());
    }
}
