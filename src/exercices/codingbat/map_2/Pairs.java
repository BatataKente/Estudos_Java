package exercices.codingbat.map_2;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
	 public Map pairs(String[] strings) {
		  final Map result = new HashMap();
		  for(int i = 0; i < strings.length; i++) {
			    final String fistLetter = strings[i].substring(0, 1);
			    final String lastLetter = (
			    		strings[i].substring(strings[i].length() - 1, strings[i].length())
			    );
			    result.put(fistLetter, lastLetter);
		  }
		  return result;
	}
	
	public Map pairs_1(String[] strings) {
		 final Map result = new HashMap();
		 for(int i = 0; i < strings.length; i++) {
			   final String fistLetter = "" + strings[i].charAt(0);
			   final String lastLetter = "" + strings[i].charAt(strings[i].length() - 1);
			   result.put(fistLetter, lastLetter);
		 }
		 return result;
	}
}
