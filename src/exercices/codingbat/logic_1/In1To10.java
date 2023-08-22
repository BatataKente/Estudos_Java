package exercices.codingbat.logic_1;

public class In1To10 {
	public boolean in1To10(int n, boolean outsideMode) {
		  if(outsideMode) return n <= 1 || n >= 10;
		  return n >= 1 && n <= 10;
	}
	public boolean in1To10_1(int n, boolean outsideMode) {
		return outsideMode? outside(n, 1, 10) : inside(n, 1, 10);
	}
	public boolean outside(int n, int min, int max) {
		return n <= min || n >= max;
	}
	public boolean inside(int n, int min, int max) {
		return n >= min && n <= max;
	}
}
