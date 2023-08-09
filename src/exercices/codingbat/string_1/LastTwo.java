package exercices.codingbat.string_1;

public class LastTwo {
	public String lastTwo(String str) {
		  if(str.length() <= 1) return str;
		  final char last = str.charAt(str.length() - 1);
		  final char mid = str.charAt(str.length() - 2);
		  return (
		    str.substring(0, str.length() - 2) + last + mid
		  );
	}
}
