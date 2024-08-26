package exercices.codingbat.string_1;

public class LastChars {
	 public String lastChars(String a, String b) {
		  final String aSubstring = (
		    a.length() == 0? "@" : a.substring(0, 1)
		  );
		  final String bSubstring = (
		    b.length() == 0? "@" : b.substring(b.length() - 1, b.length())
		  );
		  return aSubstring + bSubstring;
	}
	public String lastChars_1(String a, String b) {
		 final boolean aIsEmpty = a.length() == 0;
		 final boolean bIsEmpty = b.length() == 0;
		 if(aIsEmpty && bIsEmpty) return "@@";
		 if(aIsEmpty) return '@' + b.substring(b.length() - 1, b.length());
		 if(bIsEmpty) return a.substring(0, 1) + '@';
		 return a.substring(0, 1) + b.substring(b.length() - 1, b.length());
	}
}
