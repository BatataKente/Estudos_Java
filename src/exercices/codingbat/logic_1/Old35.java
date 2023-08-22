package exercices.codingbat.logic_1;

public class Old35 {
	public boolean old35(int n) {
		  final boolean isAMultipleOf3 = n % 3 == 0;
		  final boolean isAMultipleOf5 = n % 5 == 0;
		  return isAMultipleOf3 ^ isAMultipleOf5;
	}
	
	public boolean old35_1(int n) {
		return isAMultipleOf_x_(n, 3) ^ isAMultipleOf_x_(n, 5);
	}
	
	public boolean isAMultipleOf_x_(int n, int x) {
		return n % x == 0;
	}
}
