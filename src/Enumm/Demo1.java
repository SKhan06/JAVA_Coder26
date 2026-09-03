package Enumm;

public class Demo1 {
    public static void main(String [] args){
        PaymentStatus status = PaymentStatus.SUCCESS;
        System.out.println(status);
    }
    
}

enum PaymentStatus{
SUCCESS,
FAILED,
PENDING,
}
