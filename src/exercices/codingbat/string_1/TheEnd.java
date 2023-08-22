package exercices.codingbat.string_1;

public class TheEnd {
		public String theEnd(String str, boolean front) {
			  if(front) return String.valueOf(str.charAt(0));
			  return String.valueOf(str.charAt(str.length() - 1));
		}
}
