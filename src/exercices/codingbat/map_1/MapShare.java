package exercices.codingbat.map_1;

import java.util.Map;

public class MapShare {
    public Map mapShare(Map map) {
        final String valueOfKeyA = (String) map.get("a");
        if(valueOfKeyA != null) {
        map.put("b", valueOfKeyA);
        }
        map.remove("c");
        return map;
    }
    public Map mapShare_1(Map map) {
        if(map.containsKey("a")) {
            final String valueOfKeyA = (String) map.get("a");
            map.put("b", valueOfKeyA);
        }
        map.remove("c");
        return map;
    }
}
