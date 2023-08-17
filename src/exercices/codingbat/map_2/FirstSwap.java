package exercices.codingbat.map_2;

import java.util.HashMap;
import java.util.Map;

public class FirstSwap {
	public String[] firstSwap(String[] strings) {
		  String[] swappedLetters = new String[strings.length];
		  for(int i = 0; i < strings.length; i++) {
			    final String firstLetterI = strings[i].substring(0, 1);
			    for(int j = 0; j < i; j++) {
				      final String firstLetterJ = strings[j].substring(0, 1);
				      boolean alreadySwapped = false;
				      for(int k = 0; k < swappedLetters.length; k++) {
					        final String letterK = swappedLetters[k];
					        if(letterK == null) continue;
					        if(letterK.equals(firstLetterI) || letterK.equals(firstLetterJ)) {
					        	alreadySwapped = true;
					        }
				      }
				      if(alreadySwapped) continue;
				      if(firstLetterJ.equals(firstLetterI)) {
					        final String temp = strings[i];
					        strings[i] = strings[j];
					        strings[j] = temp;
					        swappedLetters[i] = firstLetterI;
					        swappedLetters[j] = firstLetterJ;
				      }
			    }
		  }
		  return strings;
	}
	 public String[] firstSwap_1(String[] strings) {
	   Map alreadySwappedLetters = new HashMap();
	   for(int i = 0; i < strings.length; i++) {
		     final String firstLetterI = strings[i].substring(0, 1);
		     for(int j = 0; j < i; j++) {
			       final String firstLetterJ = strings[j].substring(0, 1);
			       if(firstLetterJ.equals(firstLetterI)) {
				         if(
					           alreadySwappedLetters.containsKey(firstLetterI) ||
					           alreadySwappedLetters.containsKey(firstLetterJ)
				         ) {
				        	 continue;
				         }
				         final String temp = strings[i];
				         strings[i] = strings[j];
				         strings[j] = temp;
				         alreadySwappedLetters.put(firstLetterI, new Integer(i));
				         alreadySwappedLetters.put(firstLetterJ, new Integer(j));
			       }
		     }
	   }
	   return strings;
	 }
}
