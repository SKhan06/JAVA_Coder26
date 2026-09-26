package IterableAndCollectionInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Demo1 {

public static void main(String []args){
    List<String> c = new ArrayList<>();
    c.add("Sohail");
    c.add("Shahbaz");
    c.add("Sahzad");
    c.add("Ayyub");
    c.add("Rohan");

    Iterator<String> it = c.iterator();
    while(it.hasNext()){
        String name = it.next();
        // System.out.println(it.next());

        if(name.equals( "Sahzad")){
            it.remove();
        }
    }
      System.out.println(c);
}
    
}
