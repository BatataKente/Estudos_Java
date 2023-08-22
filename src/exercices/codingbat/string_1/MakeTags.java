package exercices.codingbat.string_1;

public class MakeTags {
		public String makeTags(String tag, String word) {
			  final String tagOpening = "<" + tag + ">";
			  final String tagClosing = "</" + tag + ">";
			  return tagOpening + word + tagClosing;
		}
}
