package exercices.codingbat.string_1;

public class ConCat {
	 public String conCat(String a, String b) {
		  final boolean aIsEmpty = a.length() == 0;
		  final boolean bIsEmpty = b.length() == 0;
		  if(aIsEmpty || bIsEmpty) return a.concat(b);
		  final char aLastChar = a.charAt(a.length() - 1);
		  final char bLastChar = b.charAt(0);
		  final boolean aLastIsBFirst = aLastChar == bLastChar;
		  return (
		    (aLastIsBFirst)
		    ? 
		    (
		      a.substring(0, a.length() - 1).concat(b)
		    ) 
		    : 
		    (a.concat(b))
		  );
	}
	public String conCat_1(String a, String b) {
		 final boolean aIsEmpty = a.length() == 0;
		 final boolean bIsEmpty = b.length() == 0;
		 if(aIsEmpty || bIsEmpty) return a.concat(b);
		 final char aLastChar = a.charAt(a.length() - 1);
		 final char bLastChar = b.charAt(0);
		 final boolean aLastIsBFirst = aLastChar == bLastChar;
		 if(aLastIsBFirst) return a.substring(0, a.length() - 1).concat(b);
		 return a.concat(b);
	}
}
