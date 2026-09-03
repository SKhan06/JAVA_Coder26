package NestedClass;

public class NonStatic {
    public static void main(String[] args){
        // Outer outer = new Outer();
        // Outer.Inner inner = outer.new Inner();
        Outer.Inner inner = new Outer().new Inner();
        inner.fun();
        
    }
}

class Outer{
    class Inner{
        void fun(){
            System.out.println("Hello from inner class");
        }
    }
}
