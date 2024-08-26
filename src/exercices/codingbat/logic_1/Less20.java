package exercices.codingbat.logic_1;

public class Less20 {
	public boolean less20(int n) {
		  final boolean is1LessThanAMultipleOf20 = is_x_LessThanAMultipleOf_y_(n, 1, 20);
		  final boolean is2LessThanAMultipleOf20 = is_x_LessThanAMultipleOf_y_(n, 2, 20);
		  return is1LessThanAMultipleOf20 || is2LessThanAMultipleOf20;
	}
	public boolean is_x_LessThanAMultipleOf_y_(final int n, final int x, final int y) {
		return (n + x) % y == 0;
	}
}
