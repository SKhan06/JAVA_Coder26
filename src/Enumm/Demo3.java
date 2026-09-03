package Enumm;

public class Demo3 {
    public static void main(String [] args){
        Direction north = Direction.NORTH;
        north.move();
    }

    
}

enum Direction{
    NORTH{
        @Override
        public void move(){
            System.out.println("Move up (y +1)");
        }
    },
    SOUTH{
        @Override
        public void move(){
            System.out.println("Move up (y -1)");
        }
    },
    EAST{
        @Override
        public void move(){
            System.out.println("Move up (y + 2)");
        }
    },
    WEST{
        @Override
        public void move(){
            System.out.println("Move up (y +3)");
        }
    };

     public abstract void move(); 
}
