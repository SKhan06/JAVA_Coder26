package Stream;
import java.util.*;
public class Demo1{
  public static void main(String []args){
    // List<Integer> list = Arrays.asList(5, 10, 15, 20, 25, 30, 35, 40);
    // List<Integer> result = list.stream()
    // .filter(n -> n> 15)
    // .map(n -> n *2)
    // .toList();

    // System.out.println(result);


    // List<Integer> number = Arrays.asList(40, 15, 30, 10, 40, 25, 20, 30, 50);
    // List<Integer> result = number.stream()
    //    .filter(n -> n>20)
    //    .distinct()
    //    .sorted()
    //    .toList();
    //    System.out.println(result);

    // List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30, 35, 40);

    // Long result = numbers.stream()
    //  .filter(n -> n>10)
    //  .map(n -> n*2)
    //  .count();
    //  System.out.println(result);


    //  List<String> names =Arrays.asList("sohail", "rahul", "aman", "rohit", "ali", "sanjay");
    //  List<String> result = names.stream()
    //  .filter(n -> n.length() >4)
    //  .map(n -> n.toUpperCase())
    //  .sorted()
    //  .toList();
    //  System.out.println(result);


    //  List<Integer> numbers = Arrays.asList(10, 15, 22, 27, 32, 41, 50);
    //  Optional<Integer> result = numbers.stream()
    //           .filter(n -> n>20 && n% 2==0)
    //           .findFirst();
    //           System.out.println(result.get());


    //  List<Integer> numbers =Arrays.asList(12, 18, 25, 30, 45);
    //  boolean result = numbers.stream()
    //            .anyMatch(n -> n %7==0);
    //            System.out.println(result);


    //  List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);     
    //  Integer result =numbers.stream()
    //  .filter(n -> n>15 && n%2 == 0)
    //  .reduce(1,(a ,b) -> a*b);
    //  System.out.println(result);

     List<Integer> numbers = Arrays.asList(10, 25, 30, 15, 40, 25, 50, 30, 60);
     List<Integer> result = numbers.stream()
     .filter(n -> n>20)
     .distinct()
     .sorted(Comparator.reverseOrder())
     .toList();
     System.out.println(result);





                 
                 
              


     
     









  }

}