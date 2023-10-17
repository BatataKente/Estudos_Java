package exercices.codingbat.array_1;

public class MakeLast {
	public int[] makeLast(int[] nums) {
		  final int[] result = new int[nums.length*2];
		  result[result.length - 1] = nums[nums.length - 1];
		  return result;
	}
}
