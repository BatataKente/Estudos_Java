package exercices.codingbat.warmup_2;

public class ArrayCount9 {
    public int arrayCount9(int[] nums) {
        int result = 0;
        for(int index = nums.length - 1; index >= 0; index--) {
            if(nums[index] == 9) result++;
        }
        return result;
    }

    public int arrayCount9_S(int[] nums) {
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }
}
