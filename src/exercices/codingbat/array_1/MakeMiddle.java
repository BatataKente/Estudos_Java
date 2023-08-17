package exercices.codingbat.array_1;

public class MakeMiddle {
	public int[] makeMiddle(int[] nums) {
		 return new int[] {nums[(nums.length/2) - 1], nums[(nums.length/2)]};
	}
	public int[] makeMiddle(int[] nums) {
		 final int halfLength = nums.length/2;
		 return new int[] {nums[halfLength - 1], nums[halfLength]};
	}
}
