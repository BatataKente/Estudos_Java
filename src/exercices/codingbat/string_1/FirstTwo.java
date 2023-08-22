package exercices.codingbat.string_1;

public class FirstTwo {
		public String firstTwo(String str) {
			  final boolean strIsShorterThan2 = str.length() < 2;
			  if(strIsShorterThan2) return str;
			  final String substring = str.substring(0, 2);
			  return substring;
		}

}
