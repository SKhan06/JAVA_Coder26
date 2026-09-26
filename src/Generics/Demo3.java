package Generics;

public class Demo3 {
    public static void main(String []args){
        Pair<String,Integer> p = new Pair<>("Sohail", 22);
        System.out.println(p.first + ","+ p.second);
    }
    
}

class Pair<T,U>{
    T first;
    U second;

    Pair(T first, U second){
        this.first = first;
        this.second = second;
    }


}
