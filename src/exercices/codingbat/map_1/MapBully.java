package exercices.codingbat.map_1;

import java.util.Map;

public class MapBully {
    public Map<String, String> mapBully(Map<String, String> map) {
        if(!map.containsKey("a")) return map;
        String aValueOfKeyA = map.get("a");
        if(!aValueOfKeyA.equals("")) {
            map.put("b", aValueOfKeyA);
            map.put("a", "");
        }
        return map;
    }
    public Map<String, String> mapBully_S(Map<String, String> map) {
        if(!map.containsKey("a")) return map;
        if(!map.get("a").equals("")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
}
