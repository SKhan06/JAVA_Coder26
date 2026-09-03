package Enumm;

public class Demo4 {
        public static void main(String [] args){
        // Direction[] directions = Direction.values();
        // for(Direction d : directions){
        //     System.out.println(d);
        // }

        Direction d = Direction.valueOf("EAST");
        System.out.println(d.name());
        System.out.println(d.ordinal());

    }
}

enum Direction{
    NORTH(),
    SOUTH(),
    EAST(),
    WEST();   
}
