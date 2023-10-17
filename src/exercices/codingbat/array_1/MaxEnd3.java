package exercices.codingbat.array_1;

public class MaxEnd3 {
	public int[] maxEnd3(int[] nums) {
		  int maxNumber = nums[0];
		  if(nums[nums.length - 1] > maxNumber) maxNumber = nums[nums.length - 1];
		  final int[] result = new int[nums.length];
		  for(int i = 0; i < result.length; i++) {
			  result[i] = maxNumber;
		  }
		  return result;
	}
}