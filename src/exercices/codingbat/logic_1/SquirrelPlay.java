package exercices.codingbat.logic_1;

public class SquirrelPlay {
	public boolean squirrelPlay(int temp, boolean isSummer) {
		  final boolean isInTempRange = (
				  temp >= 60 && temp <= (isSummer? 100 : 90)
		  );
		  return isInTempRange;
	}
}
