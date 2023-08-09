package exercices.codingbat.string_1;

public class ExtraFront {
	public String extraFront(String str) {
		  final String front = str.length() >= 2? str.substring(0, 2) : str;
		  return front + front + front;
	}
}
