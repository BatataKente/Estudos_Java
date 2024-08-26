package exercices.codingbat.array_1;

public class PlusTwo {
	public int[] plusTwo(int[] a, int[] b) {
		  final int[] ab = new int[a.length + b.length];
		  for(int i = 0; i < a.length; i++) {
			  ab[i] = a[i];
		  }
		  for(int i = 0; i < b.length; i++) {
			  ab[i + a.length] = b[i];
		  }
		  return ab;
	}
}
