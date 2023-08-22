package exercices.codingbat.map_2;

import java.util.HashMap;
import java.util.Map;

public class WordLen {
	public Map wordLen(String[] strings) {
		  final Map result = new HashMap();
		  for(int i = 0; i < strings.length; i++) {
			  result.put(strings[i], new Integer(strings[i].length()));
		  }
		  return result;
	}
}
