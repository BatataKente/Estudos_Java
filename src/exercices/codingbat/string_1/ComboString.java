package exercices.codingbat.string_1;

public class ComboString {
		public String comboString(String a, String b) {
			  final boolean aShorter = a.length() < b.length();
			  if(aShorter) {
			    return a + b + a;
			  }
			  return b + a + b;
		}
}
