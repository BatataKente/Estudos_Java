package exercices.codingbat.map_2;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
	public Map wordCount(String[] strings) {
		  final Map result = new HashMap();
		  for(int i = 0; i < strings.length; i++) {
			    int number = 1;
			    final String letter = strings[i];
			    for(int j = 0; j < i; j++) {
			      if(strings[j].equals(letter)) number++;
			    }
			    result.put(letter, new Integer(number));
		  }
		  return result;
	}
}
