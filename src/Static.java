public class Static{
 public static void main(String [] args){
    Student s1 = new Student("Sohail",1,28);
    Student s2 = new Student("Alice",2,29);
    Student.collegeName = "ABC College";
    System.out.println(s1.name + " " + s1.rollNo + " " + s1.age + " " + Student.collegeName);

 }
}

class Student{
    String name;
    int rollNo;
    int age;
    static String collegeName;
    Student(String name, int rollNo, int age)
    {
     this.name = name;
    this.rollNo = rollNo;
    this.age = age;
    }

}