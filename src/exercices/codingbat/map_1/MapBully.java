package exercices.codingbat.map_1;

import java.util.Map;

public class MapBully {
    public Map mapBully(Map map) {
        if(!map.containsKey("a")) return map;
        String aValueOfKeyA = (String) map.get("a");
        if(!aValueOfKeyA.equals("")) {
            map.put("b", aValueOfKeyA);
            map.put("a", "");
        }
        return map;
    }
    public Map mapBully_S(Map map) {
        if(!map.containsKey("a")) return map;
        if(!map.get("a").equals("")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
}
