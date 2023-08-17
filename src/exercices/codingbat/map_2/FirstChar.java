package exercices.codingbat.map_2;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {
	public Map firstChar(String[] strings) {
		  final Map result = new HashMap();
		  for(int i = 0; i < strings.length; i++) {
			    String words = strings[i];
			    final String firstLetterI = strings[i].length() >= 1? strings[i].substring(0, 1) : "";
			    for(int j = 0; j < i; j++) {
				      final String firstLetterJ = strings[j].length() >= 1? strings[j].substring(0, 1) : "";
				      if(firstLetterJ.equals(firstLetterI)) words = strings[j] + words;
			    }
			    result.put(firstLetterI, words);
			  }
		  return result;
	}
}
