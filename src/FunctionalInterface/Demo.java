package FunctionalInterface;
import java.util.*;
public class Demo{
public static void main(String[] args){
    List<Student> list = new ArrayList<>();
    list.add(new Student("Sohail", 90, 1));
    list.add(new Student("Yeshu", 50, 2));
    list.add(new Student("Arbaj", 70, 3));
    list.add(new Student("Lucky", 60, 4));
    list.add(new Student("Irfan", 50, 5));

    // Comparator<Student> s1 = new SortByName();
    // Comparator<Student> s2 = new SortByMarks();
    // Comparator<Student> s3 = new SortByrollno();

    //Collections.sort(list, s1);

    // Collections.sort(list, new Comparator<Student>(){
    //     @Override
    //     public int compare(Student s1, Student s2){
    //         return s1.name.compareTo(s2.name);
    //     }
    // });

    Collections.sort(list,(s1,s2) -> s1.marks - s2.marks);


    for(Student s :list){
        System.out.println(s.name + " " + s.marks + " " + s.rollno);
    }
}
}

// class SortByName implements Comparator<Student>{
//     @Override
//     public int compare(Student s1, Student s2){
//         return s1.name.compareTo(s2.name);
//     }
// }

// class SortByMarks implements Comparator<Student>{
//     @Override
//     public int compare(Student s1, Student s2){
//         return s1.marks - s2.marks;
//     }
// }

// class SortByrollno implements Comparator<Student>{
//     @Override
//     public int compare(Student s1, Student s2){
//         return s1.rollno - s2.rollno;
//     }
// }


class Student {
    String name;
    int marks;
    int rollno;
    public Student(String name, int marks, int rollno){
        this.name = name;
        this.marks = marks;
        this.rollno = rollno;
    }  
    }
