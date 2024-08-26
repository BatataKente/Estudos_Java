package exercices.codingbat.logic_1;

public class AlarmClock {
	public String alarmClock(int day, boolean vacation) {
		  final boolean isWeekDay = day >= 1 && day <= 5;
		  if(vacation) return isWeekDay? "10:00" : "off";
		  return (isWeekDay? 7 : 10) + ":00";
	}
}
