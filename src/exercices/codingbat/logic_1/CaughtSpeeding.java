package exercices.codingbat.logic_1;

public class CaughtSpeeding {
	public int caughtSpeeding(int speed, boolean isBirthday) {
		  final int birtDayFactor = isBirthday? 5 : 0; 
		  final boolean speedIs60OrLess = speed <= (60 + birtDayFactor);
		  if(speedIs60OrLess) return 0;
		  final boolean speedIsBetween6180 = speed > 60 && speed <= (80 + birtDayFactor);
		  if(speedIsBetween6180) return 1;
		  return 2;
	}
}
