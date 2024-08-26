package exercices.codingbat.map_1;

import java.util.Map;

public class Topping3 {
    public Map topping3(Map map) {
        final String valueOfPotato = (String) map.get("potato");
        if(valueOfPotato != null) {
            map.put("fries", valueOfPotato);
        }
        final String valueOfSalad = (String) map.get("salad");
        if(valueOfSalad != null) {
            map.put("spinach", valueOfSalad);
        }
        return map;
    }
}
