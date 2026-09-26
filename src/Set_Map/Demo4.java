package Set_Map;
import java.util.*;

public class Demo4{
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101,"Sohail");
        map.put(102,"Yeshu");
        map.put(103,"Arbaj");
        map.put(104,"Lucky");
        map.put(105,"Irfan");

        // System.out.println(map.get(103));
        // System.out.println(map.containsKey(102));
        // System.out.println(map.containsValue("Arbaj"));
        // map.remove(102);
        // System.out.println(map);

        Map<Integer, String> map2 = new HashMap<>();
        map2.putAll(map);
        // System.out.println(map2);

        // Set<Integer> keys = map.keySet();
        // System.out.println(keys);
        System.out.println(map.putIfAbsent(103, "Lucky"));
        System.out.println(map);

        Set<Map.Entry<Integer, String>> entries =map.entrySet();
        for(Map.Entry<Integer, String>  entry : entries){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        Map<Integer, String> map3 = Map.of(101,"Sohail",102,"Yeshu",103,"Arbaj",104,"Lucky",105,"Irfan");

}
}

// put() --> Always replaces the value if the key is already present
// putIfAbsent() --> Only adds the value if the key is not already present