package ObjectClass;
import java.util.*;

public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student s1 = new Student();
        s1.name = null;
        s1.age = 21;
        Student s2 = new Student();
        s2.name = "Sohail";
        s2.age = 21;
        Student s3 = (Student)s1.clone();

           System.out.println(s3);



    }
    
}

class Student implements Cloneable {
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
    public int hashCode(){
        // return Objects.hash(name,age);
        int result = 17;
        result = result * 31 + age;
        result = result * 31 + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    protected Object clone() throws CloneNotSupportedException{
       return super.clone();
    }

}

    


