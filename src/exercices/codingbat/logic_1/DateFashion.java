package exercices.codingbat.logic_1;

public class DateFashion {
	public int dateFashion(int you, int date) {
		  final boolean eitherIsntStyle = you <= 2 || date <= 2;
		  final boolean eitherVeryStylish = you >= 8 || date >= 8;
		  if(eitherIsntStyle) return 0;
		  if(eitherVeryStylish) return 2;
		  return 1;
	}
}
