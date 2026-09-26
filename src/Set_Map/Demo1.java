package Set_Map;
import java.util.*;

public class Demo1 {
    public static void main(String [] args){
        Set<String> s = new HashSet<>();
        s.add("Sohail");
        s.add("Yeshu");
        s.add("Arbaj");
        s.add("Lucky");
        s.add("Irfan");
        System.out.println(s.contains("Yeshu"));

        Map<Integer, String> m = new HashMap<>();
        m.put(101,"Sohail");
        m.put(102,"Yeshu");
        m.put(103,"Arbaj");
        m.put(104,"Lucky");
        m.put(105,"Irfan");

        System.out.println(m.containsKey(102));
        System.out.println(m.get(103));

    }

}    
        