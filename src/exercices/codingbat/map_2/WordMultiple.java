package exercices.codingbat.map_2;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
	public Map wordMultiple(String[] strings) {
		  final Map result = new HashMap();
		  for(int i = 0; i < strings.length; i++) {
			    final String wordI = strings[i];
			    boolean moreThan2Times = false;
			    for(int j = 0; j < i; j++) {
				      final String wordJ = strings[j];
				      if(wordJ.equals(wordI)) {moreThan2Times = true; break;}
			    }
			    result.put(wordI, moreThan2Times);
		  }
		  return result;
	}
}
