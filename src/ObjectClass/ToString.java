package ObjectClass;

public class ToString {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Sohail";
        s1.age = 21;
        Student s2 = new Student();
        s2.name = "Sohail";
        s2.age = 21;
        Student s3 = null;
        Integer i = 24;

        System.out.println(s1.toString());
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(i));

    }
    
}

class Student{
    String name;
    int age;

    @Override
    public String toString(){
        return ("Name :" + name+"\n" + "Age :" + age);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;

        if(obj == null) return false;

        if(obj.getClass() != this.getClass()) return false; 
        Student s = (Student) obj;

        return (this.name==s.name && this.age == s.age);

    } 

}
