package exercices.codingbat.warmup_2;

public class NoTriples {
     public boolean noTriples(int[] nums) {
       for(int i = 0; i < nums.length - 2; i++) {
         final int num0 = nums[i];
         final int num1 = nums[i + 1];
         final int num2 = nums[i + 2];
         final boolean num0EqualsNum1 = num0 == num1;
         final boolean num1EqualsNum2 = num1 == num2;
         if(num0EqualsNum1 && num1EqualsNum2) return false;
       }
       return true;
     }

    public boolean noTriples_S(int[] nums) {
        for (int i=0; i < (nums.length-2); i++) {
            int first = nums[i];
            if (nums[i+1]==first && nums[i+2]==first) return false;
        }
        return true;
    }

}
