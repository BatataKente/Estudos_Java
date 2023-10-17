package exercices.codingbat.array_1;

public class Sum2 {
	public int sum2(int[] nums) {
		  final int fistElement = nums.length >= 1? nums[0] : 0;
		  final int secondElement = nums.length >= 2? nums[1] : 0;
		  return fistElement + secondElement;
	}
}
