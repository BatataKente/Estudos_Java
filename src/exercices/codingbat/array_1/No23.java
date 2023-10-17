package exercices.codingbat.array_1;

public class No23 {
	public boolean no23(int[] nums) {
		  for(int i = 0; i < nums.length; i++) {
			    final int num = nums[i];
			    if(num == 2) return false;
			    if(num == 3) return false;
		  }
		  return true;
	}
}
