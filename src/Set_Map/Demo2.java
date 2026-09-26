package Set_Map;
import java.util.*;

public class Demo2{
    public static void main(String[] args) {
        //constructor of hashset and linkedset
        Set<Integer> set = new HashSet<>();
        //Initial capacity and load factor
        Set<Integer> set2 = new HashSet<>(100,0.8f);
        //Using collection to create a 
        Set<Integer> set3 = new HashSet<>(List.of(1, 2, 3, 4, 5));
    }
}