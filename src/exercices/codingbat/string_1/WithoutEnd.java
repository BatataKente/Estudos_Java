package exercices.codingbat.string_1;

public class WithoutEnd {
		public String withoutEnd(String str) {
			  if(str.length() < 2) return str;
			  return str.substring(1, str.length() - 1);
		}
}
