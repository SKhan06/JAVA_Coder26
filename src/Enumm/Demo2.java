package Enumm;

public class Demo2 {
    public static void main(String [] args){
        Direction d = Direction.NORTH;
        System.out.println(d);
    }
}

enum Direction{
    NORTH(0),
    SOUTH(90),
    EAST(180),
    WEST(270);

   private int degree;

   Direction(int degree){
    this.degree = degree;
   }
   public int getDegree(){
    return this.degree;
   }
}
