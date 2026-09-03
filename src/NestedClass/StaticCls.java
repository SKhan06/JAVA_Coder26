package NestedClass;

public class StaticCls {
    public static void main(String[] args){
        Outer outer = new Outer();
        Outer.inner obj = new Outer.inner(outer);
        obj.fun();
        // obj.fun(new Outer());


        BankAccount account = new BankAccount();
        BankAccount.InterestCalculater interestCalculator = new BankAccount.InterestCalculater();
        System.out.println(interestCalculator.calculaterMonthly(1000, 0.09));
    }
    
}

class Outer{
    int x =10;

    static class inner{
        Outer outer;
        inner(Outer outer){
            this.outer = outer;
        }
        void fun(){
            System.out.println("Hello from inner class");
            System.out.println("Value of x: " + outer.x);
        }
    }

}

class BankAccount{

    static class InterestCalculater{
          static double calculaterMonthly(double principal, double rate){
            return principal * rate / 12;
        }
    }

    public double computerInterest(double principal ,double rate){

        return InterestCalculater.calculaterMonthly(principal, 0.09);
    }
}

