package exercices.codingbat.string_1;

public class DeFront {
	public String deFront(String str) {
		  final boolean firstIsA = str.length() >= 1 && str.charAt(0) == 'a';
		  final boolean secondIsB = str.length() >= 2 && str.charAt(1) == 'b';
		  if(firstIsA && secondIsB) return str;
		  if(firstIsA) return 'a' + str.substring(2);
		  if(secondIsB) return 'b' + str.substring(2);
		  return str.substring(2);  
	}
}
