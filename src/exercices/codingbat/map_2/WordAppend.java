package exercices.codingbat.map_2;

public class WordAppend {
	public String wordAppend(String[] strings) {
		  String result = "";
		  for(int i = 0; i < strings.length; i++) {
			    final String letterI = strings[i];
			    int counter = 0;
			    for(int j = 0; j <= i; j++) {
				      final String letterJ = strings[j];
				      if(letterI.equals(letterJ)) counter++;
			    }
			    if(counter % 2 != 0) continue;
			    counter %= 2;
			    for(int k = 0; k <= counter; k++) {
			    	result += letterI;
			    }
		  }
		  return result;
	}
}
