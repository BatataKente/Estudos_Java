package exercices.codingbat.string_1;

public class Right2 {
	public String right2(String str) {
		  final String last2Chars = str.substring(str.length() - 2, str.length());
		  final String restOfChars = str.substring(0, str.length() - 2);
		  return last2Chars + restOfChars;
	}

	public String right2_1(String str) {
		 return (
			   str.substring(str.length() - 2, str.length()) 
			   + str.substring(0, str.length() - 2)
		 );
	}
}
