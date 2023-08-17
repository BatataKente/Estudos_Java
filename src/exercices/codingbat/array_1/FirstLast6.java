package exercices.codingbat.array_1;

public class FirstLast6 {
	public boolean firstLast6(int[] nums) {
	  final boolean fistIs6 = nums.length >= 1 && nums[0] == 6;
	  final boolean lastIs6 = nums.length >= 1 && nums[nums.length - 1] == 6;
	  return fistIs6 || lastIs6;
	}
	public boolean firstLast6_S(int[] nums) {
	   if (nums[0] == 6) {
		   return true;
	   }
	   if (nums[nums.length - 1] == 6) {
		   return true;
	   }
	   return false;
	}
}
