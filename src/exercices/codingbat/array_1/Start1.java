package exercices.codingbat.array_1;

public class Start1 {
	public int start1(int[] a, int[] b) {
		  final int aFirstIs1 = a.length >= 1 && a[0] == 1? 1 : 0;
		  final int bFirstIs1 = b.length >= 1 && b[0] == 1? 1 : 0;
		  return aFirstIs1 + bFirstIs1;
	}
}
