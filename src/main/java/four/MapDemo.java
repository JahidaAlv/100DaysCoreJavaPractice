package four;

import java.util.HashMap;
import java.util.Map;

// Map - Interface, store key-value pairs
public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

       map.put(1,"Jahida Ali");
       map.put(2, "Zaikab");
       map.put(3, "Zenni");
       map.put(4, "Zenni"); // same key for Zenni and Bob - Bob 👇
       map.put(4, "Bob"); // replaced with 👆 key will be unique
       map.put(5, "Zaikab"); // duplicate value allowed 2,5

        System.out.println("-------All Users------");
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
