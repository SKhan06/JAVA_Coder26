package Generics;

public class Demo2 {
    public static void main(String []args){
        Box<Integer> a = new Box<>(10);
        Box<String> b = new Box<>("Hello");
        Box<Boolean> c = new Box<>(true);
        System.out.println(a.getValue() +11);
        System.out.println(b.getValue().substring(0,1));
        System.out.println(c.getValue());

    }
    
}

class Box<T> {
    private T value;
       Box(T value){
        this.value= value;
    }
    public void setValue(){
        this.value = value;
    }
    public T getValue(){
        return this.value = value;
    }
}

