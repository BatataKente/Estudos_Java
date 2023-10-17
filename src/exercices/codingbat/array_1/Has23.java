package exercices.codingbat.array_1;

public class Has23 {
	public boolean has23(int[] nums) {
		  for(int i = 0; i < nums.length; i++) {
			    final int num = nums[i];
			    if(num == 2) return true;
			    if(num == 3) return true;
		  }
		  return false;
	}
}
