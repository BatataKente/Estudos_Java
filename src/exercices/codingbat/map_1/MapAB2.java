package exercices.codingbat.map_1;

import java.util.Map;

public class MapAB2 {
    public Map mapAB2(Map map) {
        if(!map.containsKey("a") || !map.containsKey("b")) return map;
        final String valueOfKeyA = (String) map.get("a");
        final String valueOfKeyB = (String) map.get("b");
        if(valueOfKeyA.equals(valueOfKeyB)) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }
    public Map mapAB2_1(Map map) {
        final String keyA = "a";
        final String keyB = "b";
        if(map.containsKey(keyA) && map.containsKey(keyB)) {
            if(map.get(keyA).equals(map.get(keyB))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }

    public Map mapAB2_2(Map map) {
        final String keyA = "a";
        final String keyB = "b";
        if(
            map.containsKey(keyA) &&
            map.containsKey(keyB) &&
            map.get(keyA).equals(map.get(keyB))
        ) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }
}
