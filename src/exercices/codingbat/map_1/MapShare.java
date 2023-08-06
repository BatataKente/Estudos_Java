package exercices.codingbat.map_1;

import java.util.Map;

public class MapShare {
    public Map<String, String> mapShare(Map<String, String> map) {
        final String valueOfKeyA = map.get("a");
        if(valueOfKeyA != null) {
        map.put("b", valueOfKeyA);
        }
        map.remove("c");
        return map;
    }
    public Map<String, String> mapShare_1(Map<String, String> map) {
        if(map.containsKey("a")) {
            final String valueOfKeyA = map.get("a");
            map.put("b", valueOfKeyA);
        }
        map.remove("c");
        return map;
    }
}
