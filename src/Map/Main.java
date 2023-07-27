package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String...args){
        Map<String,String> map = new HashMap<>();
        map.put("Car","Mazda");
        map.put("Bike","Yamaha");
        map.put("Animal","Lion");
        System.out.println(map.get("Car"));
        for (String key: map.keySet()){
            System.out.print( key + " ");
        }
        System.out.println();
        Map<String,String> tree = new TreeMap<>(map);

        for (String key : tree.keySet()) System.out.print(key + " ");
        Map<String,String> link = new LinkedHashMap<>();
        link.put("Car","Mazda");
        link.put("Bike","Yamaha");
        link.put("Animal","Lion");

        System.out.println();
        for (String key: link.keySet()) System.out.print(key + " ");
    }
}
