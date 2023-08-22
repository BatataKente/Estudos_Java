package exercices.codingbat.map_1;

import java.util.Map;

public class MapAB4 {
    public Map mapAB4(Map map) {
        final boolean hasKeyA = map.containsKey("a");
        final boolean hasKeyB = map.containsKey("b");
        if(!hasKeyA || !hasKeyB) return map;
        final String valueOfKeyA = (String) map.get("a");
        final String valueOfKeyB = (String) map.get("b");
        final int valueOfKeyALength = valueOfKeyA.length();
        final int valueOfKeyBLength = valueOfKeyB.length();
        if(valueOfKeyALength == valueOfKeyBLength) {
            map.put("a", "");
            map.put("b", "");
        } else if(valueOfKeyALength > valueOfKeyBLength) {
            map.put("c", valueOfKeyA);
        } else {
            map.put("c", valueOfKeyB);
        }
        return map;
    }
    public Map mapAB4_1(Map map) {
        final boolean hasKeyA = map.containsKey("a");
        final boolean hasKeyB = map.containsKey("b");
        if(!hasKeyA || !hasKeyB) return map;
        final String valueOfKeyA = (String) map.get("a");
        final String valueOfKeyB = (String) map.get("b");
        final int valueOfKeyALength = valueOfKeyA.length();
        final int valueOfKeyBLength = valueOfKeyB.length();
        if(valueOfKeyALength == valueOfKeyBLength) {
            map.put("a", "");
            map.put("b", "");
            return map;
        }
        if(valueOfKeyALength > valueOfKeyBLength) {
            map.put("c", valueOfKeyA);
            return map;
        }
        map.put("c", valueOfKeyB);
        return map;
    }
}
