package exercices.codingbat.array_1;

public class Double23 {
	 public boolean double23(int[] nums) {
		  final boolean twice2 = (
				  nums.length >= 2 && nums[0] == 2  && nums[1] == 2
		  );
		  final boolean twice3 = (
				  nums.length >= 2 && nums[0] == 3  && nums[1] == 3
		  );
		  return twice2 || twice3;
	}
	public boolean double23_1(int[] nums) {
		 if (nums.length >= 2 && nums[0] == 2  && nums[1] == 2) return true;
		 if (nums.length >= 2 && nums[0] == 3  && nums[1] == 3) return true;
		 return false;
	}
}
