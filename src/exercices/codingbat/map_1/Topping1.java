package exercices.codingbat.map_1;

import java.util.Map;

public class Topping1 {
    public Map topping1(Map map) {
        if(map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;
    }
}
