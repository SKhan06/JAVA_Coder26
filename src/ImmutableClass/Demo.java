package ImmutableClass;

public class Demo {
    public static void main(String[] args){
        College c1 = new College("Shadan", "Hyderabad");
        Student s1 = new Student("Sohail", 21,c1);
        System.out.println(s1.getName());
        System.out.println(c1.getName());
        System.out.println(c1.getAddress());
    }
    
}

class Student{
    private final String name;
    private final int age;
    private final College college;

    Student(String name,int age,College college){
        this.name = name;
        this.age = age;
        this.college = college;

    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public College getCollege(){
        return college;
    }

}

class College{
    private final String name;
    private final String address;

    College(String name , String address){
        this.name = name;
        this.address = address;
   }

   public String getName(){
    return name;
   }
   public String getAddress(){
    return address;
   }
 
}
