package exercices.codingbat.array_1;

public class SwapEnds {
	public int[] swapEnds(int[] nums) {
		  if(nums.length > 1) {
			    final int first = nums[0];
			    final int last = nums[nums.length - 1];
			    nums[0] = last;
			    nums[nums.length - 1] = first;
		  }
		  return nums;
	}
}
