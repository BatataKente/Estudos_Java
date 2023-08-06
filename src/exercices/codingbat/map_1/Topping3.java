package exercices.codingbat.map_1;

import java.util.Map;

public class Topping3 {
    public Map<String, String> topping3(Map<String, String> map) {
        final String valueOfPotato = map.get("potato");
        if(valueOfPotato != null) {
            map.put("fries", valueOfPotato);
        }
        final String valueOfSalad = map.get("salad");
        if(valueOfSalad != null) {
            map.put("spinach", valueOfSalad);
        }
        return map;
    }
}
