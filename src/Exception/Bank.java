package Exception;

import java.util.Scanner;

public class Bank{
    private double balance = 20000;
      void Withdrawn(int amount) throws Exception{
    if(amount <= 0){
        throw new Exception("Invalid amount");
    }if (amount > balance) {
        throw new Exception("Insufficient balance ");
        
    } else {
        balance =balance - amount;
        System.out.println("Withdrawn Successfully");
        System.out.println("Remaining balance: " + balance);
    }
  }

  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    int amount = input.nextInt();
    Bank b = new Bank();
    try {
        b.Withdrawn(amount);
       
    } catch (Exception e) {
       System.out.println(e.getMessage()); 
    }

    try {
         b.Withdrawn(amount);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    
  }
}