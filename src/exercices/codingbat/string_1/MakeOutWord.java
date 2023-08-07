package exercices.codingbat.string_1;

public class MakeOutWord {
		public String makeOutWord(String out, String word) {
			  final int length = out.length();
			  final String leftSubstring = out.substring(0, length/2);
			  final String rightSubstring = out.substring(length/2, length);
			  return leftSubstring + word + rightSubstring;
		}

}
