package exercices.codingbat.logic_2;

public class Blackjack {
	public int blackjackAlt(int a, int b) {
		int aVal = a;
		if (aVal > 21) {
			aVal = 0;
		}
		int bVal = b;
		if (bVal > 21) {
			bVal = 0;
		}
		if (aVal > bVal) {
			return aVal;
		} else {
			return bVal;
		}
	}

	public int blackjack(int a, int b) {
		final boolean aOver21 = a > 21;
		final boolean bOver21 = b > 21;
		if(aOver21 && bOver21) {
			return 0;
		}
		if(aOver21) {
			return b;
		}
		if(bOver21) {
			return a;
		}
		final int aDiference21 = Math.abs(a - 21);
		final int bDiference21 = Math.abs(b - 21);
		if(aDiference21 < bDiference21) {
			return a;
		}
		return b;
	}

}
