package exercices.codingbat.string_1;

public class HasBad {
	 public boolean hasBad(String str) {
		  if(
		    str.length() >= 3 
		    && (
		      str.substring(0, 3).equals("bad") || (
		        str.length() > 3 && str.substring(1, 4).equals("bad") 
		      )
		    )
		  ) {
		    return true;
		  }
		  return false;
	}

	public boolean hasBad_1(String str) {
		 final boolean hasEnoughtLength = str.length() >= 3;
		 final boolean initialSubstringIsBad = (
		   str.length() > 2 && str.substring(0, 3).equals("bad")
		 );
		 final boolean finalSubstringIsBad = (
		   str.length() > 3 && str.substring(1, 4).equals("bad") 
		 );
		 final boolean anySubstringIsBad = initialSubstringIsBad || finalSubstringIsBad;
		 if(hasEnoughtLength && anySubstringIsBad) {
		   return true;
		 }
		 return false;
	}
}
