package exercices.codingbat.string_1;

public class MiddleThree {
	public String middleThree(String str) {
		  final int halfLength = str.length()/2;
		  return (
		    str.substring(halfLength - 1, halfLength + 2)
		  );
	}
}
