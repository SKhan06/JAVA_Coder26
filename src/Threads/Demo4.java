package Threads;

public class Demo4 {
    public static  void main(String [] args){
        Student s1 = new Student("Sohail", 21, "CSE");
        Student s2 = new Student("Shabaz", 23, "EEE");

        Thread t1 = new Thread(()->{
               System.out.println(s1.name +" is studying");
               System.out.println(s1.name +" is solving DSA");
               System.out.println(s1.name +" finished studying"); 
        });
        Thread t2 = new Thread(()->{
               System.out.println(s2.name +" is studying");
               System.out.println(s2.name +" is solving DSA");
               System.out.println(s2.name +" finished studying"); 
        });
        try{
             t1.start();
        t1.join();
        Thread.sleep(500);
        t2.start();
        }catch(Exception e){
        }
       

    }
}

class Student {
    String name ;
    int age;
    String course;

    public Student(String name, int age, String course){
        this.name = name;
        this.age= age;
        this.course= course;
    }
}
