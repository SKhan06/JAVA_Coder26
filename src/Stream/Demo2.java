package Stream;
import java.util.*;
class Demo2{
    public static void main(String []args){
        // List<Student> s1 = Arrays.asList(
        //     new Student("Sohail", 22),
        //      new Student("Rahul", 17), 
        //      new Student("Aman", 20),
        //      new Student("Rohit", 16),
        //      new Student("Sanjay", 25));

        //     List<String> result =  s1.stream()
        //              .filter(n -> n.age >18)
        //              .map(n -> n.name)
        //              .toList();
        //     System.err.println(result);


            // List<Student> s2 = Arrays.asList(
            // new Student("Sohail", 22),
            // new Student("Rahul", 17),
            // new Student("Aman", 20),
            // new Student("Rohit", 16),
            // new Student("Sanjay", 25));

            // Optional<Student> result = s2.stream()
            //        .max(Comparator.comparingInt(s -> s.age));

            //        System.err.println(result.get().name);

            //  List<Student> s2 = Arrays.asList(
            // new Student("Sohail", 22),
            // new Student("Rahul", 17),
            // new Student("Aman", 20),
            // new Student("Rohit", 16),
            // new Student("Sanjay", 25));

            // Optional<Student> result = s2.stream()
            //        .min(Comparator.comparingInt(s -> s.age));

            //        System.out.println(result.get().name);

            
            List<Student> students = Arrays.asList(
              new Student("Sohail", 22),
              new Student("Rahul", 17),
              new Student("Aman", 20),
              new Student("Rohit", 16),
              new Student("Sanjay", 25),
              new Student("Vikas", 20));  
              
              List<String> result = students.stream()
              .filter(n -> n.age >=18)
              .sorted(Comparator.comparingInt((Student n) -> n.age).reversed())
              .map(n-> n.name)
              .toList();

              System.out.println(result);

    }
}

class Student{
    String name;
    int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}