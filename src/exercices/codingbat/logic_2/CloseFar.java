package exercices.codingbat.logic_2;

public class CloseFar {
	public boolean closeFar(int a, int b, int c) {
		final boolean bIsClose = xCloseY(b, a);
		final boolean cIsClose = xCloseY(c, a);
		final boolean bIsFarA = xFarY(b, a);
		final boolean bIsFarC = xFarY(b, c);
		final boolean cIsFarA = xFarY(c, a);
		final boolean cIsFarB = xFarY(c, b);
		if(bIsClose && cIsFarA && cIsFarB || cIsClose && bIsFarA && bIsFarC) {
			return true;
		}
		return false;
	}

	public boolean xCloseY(final int x, final int y) {
		return x <= y + 1 || y >= y - 1;
	}

	public boolean xFarY(final int x, final int y) {
		return x > y + 2 || x <= y - 2;
	}
}
