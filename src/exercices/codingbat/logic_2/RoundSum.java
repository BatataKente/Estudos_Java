package exercices.codingbat.logic_2;

public class RoundSum {
	public int roundSum(int a, int b, int c) {
		return roundBy5(a) + roundBy5(b) + roundBy5(c);
	}

	public int roundBy5(final int n) {
		final int nRestTeen = n % 10;
		if(nRestTeen < 5) {
			return n - nRestTeen;
		}
		return n + Math.abs(nRestTeen - 10);
	}
}
