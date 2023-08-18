package exercices.codingbat.logic_1;

public class SpecialEleven {
	public boolean specialEleven(int n) {
		  final boolean isMultipleOf11 = n % 11 == 0;
		  final boolean isOneMoreThanAMultipleOf11 = (n - 1) % 11 == 0;
		  return (
		      isMultipleOf11 || isOneMoreThanAMultipleOf11
		  );
	}
}
