package exercices.codingbat.array_1;

public class SameFirstLast {
	public boolean sameFirstLast(int[] nums) {
	   final boolean firstEqualsLast = (
	     nums.length >= 1 && nums[0] == nums[nums.length - 1]
	   );
	   return firstEqualsLast;
	}
	public boolean sameFirstLast_S(int[] nums) {
	  return (nums.length >= 1 && nums[0] == nums[nums.length - 1]);
	}
}
