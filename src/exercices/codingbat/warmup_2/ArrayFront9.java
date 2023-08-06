package exercices.codingbat.warmup_2;

public class ArrayFront9 {
    public boolean arrayFront9(int[] nums) {
        final int maxCounter = nums.length > 4? 4 : nums.length + 1;
        for(int i = 0; i < maxCounter - 1; i++) {
            if(nums[i] == 9) return true;
        }
        return false;
    }

    public boolean arrayFront9_S(int[] nums) {
        int end = nums.length;
        if (end > 4) end = 4;
        for (int i=0; i<end; i++) {
            if (nums[i] == 9) return true;
        }
        return false;
    }
}
