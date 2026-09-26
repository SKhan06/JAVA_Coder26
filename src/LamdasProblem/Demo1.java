package LamdasProblem;
class Demo1{
    public static void main(String []args){
        Calculater c = (a,b) -> a+b;
        System.out.println(c.add(5,7));

        
    }
}   
@FunctionalInterface 
interface Calculater{
    int add(int a, int b);
}