package exercices.codingbat.array_1;

public class Reverse3 {
	public int[] reverse3(int[] nums) {
		  final int[] reverseNums = new int[nums.length];
		  for(int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
			    reverseNums[i] = nums[j];
		  }
		  return reverseNums;
	}
}