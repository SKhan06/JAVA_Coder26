package Stream;
import java.util.*;
class Demo {

    public static void main(String[] args) {
        // List<Integer> list = Arrays.asList(10,15,20,25,30,35,40);
        // list.stream()
        //     .filter(n-> n>20 && n%2==0)
        //     .forEach(System.out::println);

        // List<Integer> list = Arrays.asList(5, 10, 15, 20, 25, 30);
        // list.stream()
        // .filter(n -> n>10)
        // .map(n-> n*2)
        // .forEach(System.out::println);


        // List<String> name = Arrays.asList("Sohail", "Aman", "Rahul", "Rohit", "Ali", "Sanjay");
        // name.stream()
        //         .filter(n -> n.length() >= 5)
        //         .map(n -> n.toUpperCase())
        //         .forEach(System.out::println);

        // List<Integer> list = Arrays.asList(40, 10, 20, 40, 30, 10, 50, 20);
        // list.stream()
        // .distinct() //Avoid duplicate values
        // .sorted() // Sort the values in ascending order
        // .forEach(System.out::println);



        // List<Integer> list = Arrays.asList(40, 10, 20, 40, 30, 10, 50, 20);
        // list.stream()
        // .skip(2) // Skip the first 2 elements
        // .limit(3) // Limit the stream to the next 3 elements
        // .forEach(System.out::println);



        // List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35, 40, 45);
        //  long count =list.stream()
        //              .filter(n -> n>20)
        //              .count(); // Count the number of elements greater than 20
        //     System.out.println(count)
        // 


        //     List<Integer> list = Arrays.asList(45, 12, 78, 34, 9, 56, 23);
        //     Optional<Integer> min =list.stream()
        //              .min(Integer::compare); // Find the minimum value in the stream
        //              System.out.println("Minimum value: " + min.get());
        //   Optional<Integer> max =list.stream()
        //              .max(Integer::compare); // Find the maximum value in the stream
        //              System.out.println("Maximum value: " + max.get());


        // List<Integer> list =Arrays.asList(10, 25, 30, 45, 50, 65);
        // Optional<Integer> f= list.stream()
        // .filter(n -> n>30)
        // .findFirst();// Find the first element greater than 30

        // System.out.println(f.get());


        // List<Integer> list =Arrays.asList(10, 25, 30, 45, 50, 65);
        // boolean found = list.stream()
        // .anyMatch(n -> n>45);// Find the first element greater than 45

        // System.out.println(found);

        // List<Integer> list =Arrays.asList(20, 30, 40, 50, 60);
        //    boolean found = list.stream()
        //    .allMatch(n -> n>10);// Check if all elements are greater than 10 

        //    System.out.println(found);


        //    List<Integer> list =Arrays.asList(20, 30, 40, 50, 60);
        //    boolean found = list.stream()
        //    .noneMatch(n -> n>70);// Check if no elements are greater than 10 

        //    System.out.println(found);

        //    List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        //    int sum =list.stream()
        //    .reduce(0,(a,b) -> a+b);// Sum of all elements in the stream

        //    System.out.println(sum);

        // List<Integer> list = Arrays.asList(5, 10, 15, 20, 25, 30);
        //    int sum =list.stream()
        //    .filter(n -> n>10 && n%2==0)
        //    .reduce(0,(a,b) -> a+b);// Sum of all elements in the stream

        //    System.out.println(sum);


           List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2),Arrays.asList(3, 4),Arrays.asList(5, 6));
           list.stream()
           .flatMap(List::stream)
           .forEach(System.out::println);// Flatten the list of lists into a single stream of integers
    }
}
