package exercices.codingbat.map_1;

import java.util.HashMap;
import java.util.Map;

public class MapAB {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("a", "Hi");
		map.put("b", "There");
		System.out.println(mapAB(map));
	}
    public static Map mapAB(Map map) {
        final boolean containsKeyA = map.containsKey("a");
        final boolean containsKeyB = map.containsKey("b");
        if(containsKeyA && containsKeyB) {
            final String valueOfKeyA = (String) map.get("a");
            final String valueOfKeyB = (String) map.get("b");
            map.put("ab", valueOfKeyA + valueOfKeyB);
        }
        return map;
    }
}
