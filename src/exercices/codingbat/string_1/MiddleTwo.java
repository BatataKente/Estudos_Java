package exercices.codingbat.string_1;

public class MiddleTwo {
		public String middleTwo(String str) {
			  final boolean isEven = str.length() % 2 == 0;
			  final int length = str.length();
			  if(isEven && length > 2) {
			    final int halfOfLength = length/2;
			    return str.substring(halfOfLength - 1, halfOfLength + 1);
			  }
			  return str;
		} 
}
