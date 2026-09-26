package IterableAndCollectionInterface;

import java.util.*;

public class Demo2 {
    public static void main(String [] args){
        // Collection<Integer> c = new ArrayList<>();
        // c.add(10);
        // c.add(20);
        // c.add(30);
        // c.add(40);
        // c.add(50);
        // System.out.println(c.size());
        // System.out.println(c.contains(30));
        // System.out.println(c.remove(40));
        // System.out.println(c);

        // Collection<String> s = new ArrayList<>();
        // s.add("Aman");
        // s.add("Rahul");
        // s.add("Rohit");
        // s.add("Vijay");
        // s.add("Arman");

        // Iterator<String> it = s.iterator();

        // while(it.hasNext()){
        //     String n = it.next();
        //     if(n == "Arman"){
        //         it.remove();
        //     }
        // }
        // System.out.println(s);

        // Collection<Integer> nums = new ArrayList<>();
        //  nums.add(10);
        //  nums.add(20);
        //  nums.add(30);
        //  nums.add(40);
        //  nums.add(50);
        //  nums.add(60);
        // nums.removeAll(List.of(20,40,60));
        //  Iterator<Integer> it = nums.iterator();
        //  while(it.hasNext()){
        //     Integer i = it.next();
        //     System.out.println(i);
        //     }

            Collection<Integer> num = new ArrayList<>();

             num.add(10);
             num.add(15);
             num.add(20);
             num.add(25);
             num.add(30);
             num.add(35);  
                // num.removeIf(n-> n%2 == 0);
                // System.out.println(num);
                num.retainAll(List.of(10,15,30));
                System.out.println(num);
         }
         
       



    }

