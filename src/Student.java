public class Student {
    String name;
    int age;
    int rollNo;
    String collegeName;
    public Student(int rollNo, String name, int age, String collegeName){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.collegeName = collegeName;
    }
    @Override
    public String toString(){
        return "Name:" +name+", Age:" +age+ ", Roll No:" +rollNo+ ", College:" +collegeName;
    }
    public static void main(String[] args) {
        Student s1 = new Student(1, "John", 20, "ABC College");
        System.out.println(s1);
    }
    
}
