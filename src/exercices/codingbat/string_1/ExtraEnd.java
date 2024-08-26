package exercices.codingbat.string_1;

public class ExtraEnd {
		public String extraEnd(String str) {
			  if(str.length() < 2) return str;
			  final String substring = str.substring(str.length() - 2, str.length());
			  return substring + substring + substring;
		}
		public String extraEnd_1(String str) {
			  if(str.length() < 2) return str;
			  final String substring = str.substring(str.length() - 2);
			  return substring + substring + substring;
		}

}
