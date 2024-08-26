package exercices.codingbat.logic_1;

public class Near10 {
	 public boolean nearTen(int num) {
		  final boolean isWithin2OfAMultipleOf10 = (
			    isMultipleOf10(num) || isMultipleOf10(num - 1) || 
			    isMultipleOf10(num + 1) || isMultipleOf10(num - 2) || 
			    isMultipleOf10(num + 2)
		  );
		  return isWithin2OfAMultipleOf10;
	}
	public boolean nearTen_1(int num) {
		 for(int i = - 2; i <= 2; i++) {
			 if(isMultipleOf10(num + i)) return true;
		 }
		 return false;
	}
	public boolean isMultipleOf10(final int n) {
		return isMultipleOf_x_(n, 10);
	}
	public boolean isMultipleOf_x_(final int n, final int x) {
		return n % x == 0;
	}
}
