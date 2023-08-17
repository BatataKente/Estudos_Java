package exercices.codingbat.map_2;

import java.util.Arrays;

public class AllSwap {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(allSwap(new String[]{"ab", "ac"})));
		System.out.println(Arrays.toString(allSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));
		System.out.println(Arrays.toString(allSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"})));
	}
	public static String[] allSwap(String[] strings) {
		  int[] swappedKeys = new int[strings.length];
		  for(int i = 0; i < strings.length; i++) {
			    final String firstLetterI = strings[i].substring(0, 1);
			    for(int j = 0; j < i; j++) {
				      final String firstLetterJ = strings[j].substring(0, 1);
				      if(firstLetterJ.equals(firstLetterI)) {
					        boolean alreadySwapped = false;
					        for(int k = 0; k < swappedKeys.length; k++) {
						          if(
							            swappedKeys[k] == (i + 1) ||
							            swappedKeys[k] == (j + 1)
						          ) {
						        	  alreadySwapped = true;
						          }
					        }
					        if(alreadySwapped) continue;
					        final String temp = strings[i];
					        strings[i] = strings[j];
					        strings[j] = temp;
					        swappedKeys[i] = i + 1;
					        swappedKeys[j] = j + 1;
				      }
			    }
		  }
		  return strings;
	}
	public static String[] allSwap_1(String[] strings) {
		  int[] swappedKeys = new int[strings.length];
		  for(int i = 0; i < strings.length; i++) {
			    final String firstLetterI = strings[i].substring(0, 1);
			    for(int j = 0; j < i; j++) {
				      final String firstLetterJ = strings[j].substring(0, 1);
				      if(firstLetterJ.equals(firstLetterI)) {
					        boolean alreadySwapped = false;
					        for(int k = 0; k < swappedKeys.length; k++) {
						          if(
							            swappedKeys[k] == (i + 1) ||
							            swappedKeys[k] == (j + 1)
						          ) {
						        	  alreadySwapped = true;
						          }
					        }
					        if(alreadySwapped) continue;
					        final String temp = strings[i];
					        strings[i] = strings[j];
					        strings[j] = temp;
					        swappedKeys[i] = i + 1;
					        swappedKeys[j] = j + 1;
				      }
			    }
		  }
		  return strings;
	}
}
