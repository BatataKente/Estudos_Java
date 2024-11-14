package exercices.codingbat.logic_2;

public class NoTeenSum {
	public int noTeenSum(int a, int b, int c) {
		return fixTeen(a) + fixTeen(b) + fixTeen(c);
	}

	public int fixTeen(int n) {
		final boolean nIsATeenInTheRange13_19Except15_16 = (
				n >= 13 && n <= 19 && n != 15 && n != 16
		);
		return nIsATeenInTheRange13_19Except15_16? 0 : n;
	}
}
