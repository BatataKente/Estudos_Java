package exercices.codingbat.array_1;

public class BiggerTwo {
	public int[] biggerTwo(int[] a, int[] b) {
		  final int aSum = a[0] + a[1];
		  final int bSum = b[0] + b[1];
		  if(bSum > aSum) return b;
		  return a;
	}
}
