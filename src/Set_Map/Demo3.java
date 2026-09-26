package Set_Map;
import java.util.*;
public class Demo3{
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(23);
        set.add(80);
        set.add(90);
        set.add(50);
        set.add(60);
    //     set.add(45);
    //    System.out.println(set.first());
    //    System.out.println(set.last());
    //    System.out.println(set.headSet(80,true));
    //    System.out.println(set.tailSet(80,false));
    //    System.out.println(set.subSet(10, 60));
    //    System.out.println(set.lower(10));
    //    System.out.println(set.floor(80));
    
    // System.out.println(set.higher(10));
    // System.out.println(set.ceiling(10));
    // System.out.println(set.pollFirst());
    // System.out.println(set.pollLast());
    // System.out.println(set.first());
     System.out.println(set.descendingSet());
     Iterator<Integer> it = set.descendingIterator();
     while(it.hasNext()){
        System.out.println(it.next());
     }


    }
} 