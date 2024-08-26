package exercices.codingbat.logic_1;

public class More20 {
	public boolean more20(int n) {
		  final boolean is1MoreThanAMultipleOf20 = (n - 1) % 20 == 0;
		  final boolean is2MoreThanAMultipleOf20 = (n - 2) % 20 == 0;
		  return is1MoreThanAMultipleOf20 || is2MoreThanAMultipleOf20;
	}
	public boolean more20_1(int n) {
		 return (
			   is_X_MoreThanAMultipleOf_Y_(n, 1, 20) || 
			   is_X_MoreThanAMultipleOf_Y_(n, 2, 20)
		 );
	}
	public boolean is_X_MoreThanAMultipleOf_Y_(int n, int x, int y) {
		return (n - x) % y == 0;
	}
}
