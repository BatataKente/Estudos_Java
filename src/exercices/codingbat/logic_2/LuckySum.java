package exercices.codingbat.logic_2;

public class LuckySum {
	public int luckySum(int a, int b, int c) {
		final boolean aIs13 = a == 13;
		final boolean bIs13 = b == 13;
		final boolean cIs13 = c == 13;
		if(aIs13) {
			a = 0;
			b = 0;
			c = 0;
		}
		if(bIs13) {
			b = 0;
			c = 0;
		}
		if(cIs13) {
			c = 0;
		}
		return a + b + c;
	}
}
