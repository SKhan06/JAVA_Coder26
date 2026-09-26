package IterableAndCollectionInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo3 {
    public static void main(String [] args){
    //  Collection<Integer> n = new ArrayList<>();
    //   n.add(10);
    //   n.add(20);
    //   n.add(30);
    //   n.add(40);
    //   n.add(50);
    //   System.out.println(n.containsAll(List.of(20,40)));

    Collection<Integer> a = new ArrayList<>();
      a.add(10);
      a.add(20);
      a.add(30);
    Collection<Integer> b = new ArrayList<>();
      b.add(40);
      b.add(50);
      b.add(60);
      a.addAll(b);
    System.out.println(a);

      
    }
}
