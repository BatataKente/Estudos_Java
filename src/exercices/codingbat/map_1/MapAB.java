package exercices.codingbat.map_1;

import java.util.Map;

public class MapAB {
    public Map<String, String> mapAB(Map<String, String> map) {
        final boolean containsKeyA = map.containsKey("a");
        final boolean containsKeyB = map.containsKey("b");
        if(containsKeyA && containsKeyB) {
            final String valueOfKeyA = map.get("a");
            final String valueOfKeyB = map.get("b");
            map.put("ab", valueOfKeyA + valueOfKeyB);
        }
        return map;
    }
}
