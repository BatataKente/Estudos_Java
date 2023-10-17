package exercices.codingbat.string_1;

public class FrontAgain {
	public boolean frontAgain(String str) {
		  if(str.length() == 2) return true;
		  if(
		    str.length() > 2 && 
		    str.substring(0, 2).equals(str.substring(str.length() - 2))
		  ) {
		    return true;
		  }
		  return false;
	}
}
