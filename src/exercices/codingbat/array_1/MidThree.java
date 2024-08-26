package exercices.codingbat.array_1;

public class MidThree {
	public int[] midThree(int[] nums) {
		  return new int[] {
			    nums[((nums.length - 1)/2) - 1],
			    nums[((nums.length - 1)/2)],
			    nums[((nums.length - 1)/2) + 1]
		  };
	}
}
