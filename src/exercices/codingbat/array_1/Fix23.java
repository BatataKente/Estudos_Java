package exercices.codingbat.array_1;

public class Fix23 {
	public int[] fix23(int[] nums) {
		  for(int i = 0; i < nums.length - 1; i++) {
			    final int currentNum = nums[i];
			    final int nextNum = nums[i + 1];
			    if(currentNum == 2 && nextNum == 3) nums[i + 1] = 0;
		  }
		  return nums;
	}
}
