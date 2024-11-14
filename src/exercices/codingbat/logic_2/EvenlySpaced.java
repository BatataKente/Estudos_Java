package exercices.codingbat.logic_2;

public class EvenlySpaced {
	public boolean evenlySpaced(int a, int b, int c) {
		  final int min = Math.min(Math.min(a, b), c);
		  final int max = Math.max(Math.max(a, b), c);
		  final int mid = a + b + c - max - min;
		  final int diferenceMinMid = Math.abs(min - mid);
		  final int diferenceMidMax = Math.abs(mid - max);
		  return diferenceMinMid == diferenceMidMax;
	}
}
