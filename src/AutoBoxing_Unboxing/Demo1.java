package AutoBoxing_Unboxing;

public class Demo1 {
    public static void main(String [] args){

        // These methods are used to assignment,method ,arithmetic operations
        Integer x = 10; // AutoBoxing
        int y = x; // UnBoxing

        System.out.println(x);
        System.out.println(y);

        int a = 20;
        Integer b = a;

        System.out.println(a);
        System.out.println(b);

        Integer z = 30;
        print(z);
    }

    static void print(int x){
        System.out.println(x);
    }
    
}
