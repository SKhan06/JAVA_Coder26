package List;

import java.util.*;

public class Demo1 {
    public static void main(String [] args){
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        // System.out.println(a.get(2));
        // System.out.println(a.addAll(1,List.of(7,8,9)));
        // System.out.println(a.indexOf(2));
        // System.out.println(a.lastIndexOf(2));

        ListIterator<Integer> it = a.listIterator(6);
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }

        List<Integer> l = List.of(1,2,3,4,5,6,6,7,8,9);
        List<Integer> l2 = List.copyOf(l);
        System.out.println(l2);

    }
    
}
