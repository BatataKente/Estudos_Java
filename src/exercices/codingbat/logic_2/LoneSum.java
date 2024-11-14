package exercices.codingbat.logic_2;

public class LoneSum {
	public int loneSum(int a, int b, int c) {
		int sum = 0;
		if (a != b && a != c) {
			sum += a;
		}
		if (b != a && b != c) {
			sum += b;
		}
		if (c != a && c != b) {
			sum += c;
		}
		return sum;
	}

	public int loneSumAlt(int a, int b, int c) {
		final boolean bEqualsC = b == c;
		final boolean aEqualsC = a == c;
		final boolean aEqualsB = a == b;
		if(bEqualsC) {
			b = 0;
			c = 0;
		}
		if(aEqualsB) {
			b = 0;
			a = 0;
		}
		if(aEqualsC) {
			a = 0;
			c = 0;
		}
		return a + b + c;
	}
}
