package exercices.codingbat.array_1;

public class CommonEnd {
	public boolean commonEnd(int[] a, int[] b) {
		  final boolean aAndBHasLength = a.length >= 1 && b.length >= 1;
		  final boolean sameFirst = aAndBHasLength && b[0] == a[0];
		  final boolean sameLast = aAndBHasLength && b[b.length - 1] == a[a.length - 1];
		  return sameFirst || sameLast;
	}
}
