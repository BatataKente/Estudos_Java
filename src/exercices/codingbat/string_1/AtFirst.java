package exercices.codingbat.string_1;

public class AtFirst {
	 public String atFirst(String str) {
		  final boolean strLengthIsLessThan2 = str.length() < 2;
		  if(str.length() == 0) return "@@";
		  final int strLength2Diference = str.length() - 2 > 0? str.length() - 1 : 0;
		  if(strLengthIsLessThan2) {
		    String result = "";
		    for(int i = 0; i < strLength2Diference + 1; i++) {
		      result += "@";
		    }
		    return str + result;
		  }
		  return str.substring(0, 2);
	}

	public String atFirst_1(String str) {
		 final boolean strLengthLessThan2 = str.length() < 2;
		 if(strLengthLessThan2) {
		   int strLength2Diference = 0;
		   if(str.length() - 2 > 0) strLength2Diference = str.length() - 1;
		   if(str.length() == 0) strLength2Diference = 1;
		   String result = "";
		   for(int i = 0; i < strLength2Diference + 1; i++) {
		     result += "@";
		   }
		   return str + result;
		 }
		 return str.substring(0, 2);
	}
}
