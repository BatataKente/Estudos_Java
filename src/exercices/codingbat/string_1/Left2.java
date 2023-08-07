package exercices.codingbat.string_1;

public class Left2 {
		public String left2(String str) {
			  return str.substring(2) + str.substring(0, str.length() - str.length() + 2);
		}
}
