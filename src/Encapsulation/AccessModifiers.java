package Encapsulation;

public class AccessModifiers {
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        account.deposite(1000);
        account.withdraw(500);
        System.out.println("Balance: " + account.getBalance());

        Student s1 = new Student();
        s1.setAge(21);
        System.out.println("Age: " + s1.getAge()); 


    }
    
}

class BankAccount{
    private double balance;
    private String accountNumber;
    public void deposite(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        }else{
            System.out.println("Insufficient balance");
        }
    }
    public double getBalance(){
        return balance;
    }
}

class Student {
    private String name;
    private int age;
    private int rollNo;
    private String collegeName;
    // public Student(String name, int age, int rollNo, String collegeName){
    //     this.name= name;
    //     this.age = age;
    //     this.rollNo = rollNo;
    //     this.collegeName = collegeName;
    // }
     public String getName(){
        return name;
     }
     public int getAge(){
        return age;
     }
     public int getRollNo(){
        return rollNo;
     }
     public String getCollegeName(){
        return collegeName;
     }
     public void setName(String name){
        this.name = name;
     }
     public void setAge(int age){
        this.age = age;
     }
     public void setRollNo(int rollNo){
        this.rollNo = rollNo;
     }
     public void setCollegeName(String collegeName){
        this.collegeName = collegeName;
     }

}