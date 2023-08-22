package exercices.codingbat.map_1;

import java.util.Map;

public class Topping2 {
    public Map topping2(Map map) {
        final String valueOfIceCream = (String) map.get("ice cream");
        if(valueOfIceCream != null) {
            map.put("yogurt", valueOfIceCream);
        }
        if(map.get("spinach") != null) {
            map.put("spinach", "nuts");
        }
        return map;
    }
    public Map topping2_1(Map map) {
        final String iceCream = "ice cream";
        if(map.containsKey(iceCream)) {
            map.put("yogurt", map.get(iceCream));
        }
        if(map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }
}
