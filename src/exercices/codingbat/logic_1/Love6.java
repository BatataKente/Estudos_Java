package exercices.codingbat.logic_1;

public class Love6 {
	public boolean love6(int a, int b) {
		return loveNumber(6, a, b);
	}

	public boolean loveNumber(int number, int a, int b) {
		  final boolean aIsNumber = a == number;
		  final boolean bIsNumber = b == number;
		  final boolean theirSumIsNumber = a + b == number;
		  final boolean theirDifferenceIsNumber = Math.abs(a - b) == number;
		  return (
		    aIsNumber || bIsNumber || theirSumIsNumber || theirDifferenceIsNumber
		  );
	}
}
