package exercices.codingbat.array_1;

public class Sum3 {
	public int sum3(int[] nums) {
		  int result = 0;
		  for(int i = 0; i < nums.length; i++) {
			  result += nums[i];
		  }
		  return result;
	}
	public int sum3_1(int[] nums) {
		  return nums[0] + nums[1] + nums[2];
	}
}
