package exercices.codingbat.map_1;

import java.util.Map;

public class MapAB3 {
    public Map<String, String> mapAB3(Map<String, String> map) {
        final String valueOfKeyA = map.get("a");
        final String valueOfKeyB = map.get("b");
        if(valueOfKeyA != null && valueOfKeyB != null) return map;
        if(valueOfKeyA != null) {
            map.put("b", valueOfKeyA);
        }
        if(valueOfKeyB != null) {
            map.put("a", valueOfKeyB);
        }
        return map;
    }
    public Map<String, String> mapAB3_1(Map<String, String> map) {
        final boolean keyAHasAnValue = map.containsKey("a");
        final boolean keyBHasAnValue = map.containsKey("b");
        if(keyAHasAnValue && keyBHasAnValue) return map;
        if(keyAHasAnValue) {
            map.put("b", map.get("a"));
        }
        if(keyBHasAnValue) {
            map.put("a", map.get("b"));
        }
        return map;
    }
}
