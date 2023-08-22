package exercices.codingbat.string_1;

public class MinCat {
	public String minCat(String a, String b) {
		  if(a.length() == 0 || b.length() == 0) return "";
		  final String smallerStr = a.length() > b.length()? b : a;
		  final String greaterStr = a.length() < b.length()? b : a;
		  if(greaterStr.equals(a)) {
		    return (
		      greaterStr
		        .substring(greaterStr.length() - smallerStr.length(), greaterStr.length())
		        .concat(smallerStr)
		    );
		  } else {
		    return (
		      smallerStr.concat(
		        greaterStr.substring(greaterStr.length() - smallerStr.length(), greaterStr.length())
		      )
		    );
		  }
	}
}
