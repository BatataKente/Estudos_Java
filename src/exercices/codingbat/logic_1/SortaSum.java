package exercices.codingbat.logic_1;

public class SortaSum {
	 public int sortaSum(int a, int b) {
	  final int result = a + b;
	  if(inRange(result, 10, 19)) return 20;
	  return result;
	}
	public boolean inRange(int value, int min, int max) {
		return value >= min && value <= max;
	}

	public int sortaSum_2(int a, int b) {
		return inRange(a + b, 10, 19)? 20 : a + b;
	}
	public boolean inRange_1(int value, int min, int max) {
		return value >= min && value <= max;
	}
}
