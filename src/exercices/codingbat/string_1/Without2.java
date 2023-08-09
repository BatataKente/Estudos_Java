package exercices.codingbat.string_1;

public class Without2 {
	public String without2(String str) {
		  if(str.length() == 2) return "";
		  if(str.length() <= 1) return str;
		  final String beginning = str.substring(0, 2);
		  final String end = str.substring(str.length() - 2);
		  if(beginning.equals(end)) {
		    return str.substring(2);
		  }
		  return str;
	}
}
