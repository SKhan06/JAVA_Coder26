import java.util.*;
public class ComparableInterface {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Sohail", 90));
        list.add(new Student("Yeshu", 50));
        list.add(new Student("Arbaj", 70));
        list.add(new Student("Lucky", 60));
        list.add(new Student("Irfan", 50));
         Collections.sort(list);
         for(Student s : list){
            System.out.println(s.name + " " + s.marks);
         }

        

    }
}
class Student implements Comparable<Student>{
    String name;
    int marks;
    public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    @Override
    public int compareTo(Student Other){
        if(this.marks != Other.marks){
            return this.marks - Other.marks;
        }
        return this.name.compareTo(Other.name);
    }

}