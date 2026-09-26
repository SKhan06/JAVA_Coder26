package Generics;

public class Demo {
    public static void main(String [] args ){
        Box a = new Box(10);
        Box b = new Box("Hello");
        Box c = new Box(true);

        // downCasting
        Integer t = (Integer) a.getValue();
        String  s  = (String) b.getValue();
        Boolean x  = (Boolean) c.getValue();
        
        System.out.println(t+ 5);
         System.out.println(s+ 5);
          System.out.println(x);
        
    }
    
}

class Box {
    private Object value;
       Box(Object value){
        this.value= value;
    }
    public void setValue(){
        this.value = value;
    }
    public Object getValue(){
        return this.value = value;
    }
}
