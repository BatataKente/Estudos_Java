package exercices.codingbat.array_1;

public class RotateLeft3 {
	public int[] rotateLeft3(int[] nums) {
		  final int[] rotatedLeftNums = new int[nums.length];
		  rotatedLeftNums[nums.length - 1] = nums[0];
		  for(int i = 1, j = 0; i < nums.length; i++, j++) {
			  rotatedLeftNums[j] = nums[i];
		  }
		  return rotatedLeftNums;
	}
	public int[] rotateLeft3_1(int[] nums) {
		return new int[] {nums[1], nums[2], nums[0]};
	}
}
