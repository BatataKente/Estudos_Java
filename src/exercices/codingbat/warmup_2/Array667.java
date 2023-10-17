package exercices.codingbat.warmup_2;

public class Array667 {
     public int array667(int[] nums) {
       String sentence = "";
       for(int i = 0; i < nums.length; i++) {
         final int number = nums[i];
         sentence += String.valueOf(number);
       }
       int result = 0;
       for(int i = 0; i < sentence.length() - 1; i++) {
         final String substring = sentence.substring(i, i + 2);
         if(substring.equals("66") || substring.equals("67")) {
           result++;
         }
       }
       return result;
     }
    public int array667_1(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            final int num = nums[i];
            final int nextNum = nums[i + 1];
            final boolean numIs6NextIs6 = num == 6 && nextNum == 6;
            final boolean numIs6NextIs7 = num == 6 && nextNum == 7;
            if(numIs6NextIs6 || numIs6NextIs7) result++;
        }
        return result;
    }
     public int array667_S(int[] nums) {
       int count = 0;
       for (int i=0; i < (nums.length-1); i++) {
         if (nums[i] == 6) {
           if (nums[i+1] == 6 || nums[i+1] == 7) {
             count++;
           }
         }
       }
       return count;
     }
}
