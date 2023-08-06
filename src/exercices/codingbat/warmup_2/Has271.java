package exercices.codingbat.warmup_2;

public class Has271 {
     public boolean has271(int[] nums) {
       for(int i = 0; i < nums.length - 2; i++) {
         final int numA = nums[i];
         final int numB = nums[i + 1];
         final int numC = nums[i + 2];
         final boolean numBAreAPlus5 = numB == (numA + 5);
         final boolean numCAreALess1 = numC == (numA - 1);
         final boolean numCAreALess2 = numC == (numA - 2);
         final boolean numCAreALess3 = numC == (numA - 3);
         final boolean numCAreAPlus1 = numC == (numA + 1);
         final boolean numCAreAPlus1OrLess1OrLess2OrLess3 = (
           numCAreALess1 || numCAreAPlus1 || numCAreALess2 || numCAreALess3
         );
         if(numBAreAPlus5 && numCAreAPlus1OrLess1OrLess2OrLess3) return true;
       }
       return false;
     }
     public boolean has271_S(int[] nums) {
       for (int i=0; i < (nums.length-2); i++) {
         int val = nums[i];
         if (nums[i+1] == (val+5) && Math.abs(nums[i+2] - (val-1)) <= 2) {
             return true;
         }
       }
       return false;
     }
    public boolean has271_1(int[] nums) {
        for(int i = 0; i < nums.length - 2; i++) {
            final int numA = nums[i];
            final int numB = nums[i + 1];
            final int numC = nums[i + 2];
            final boolean numBAreAPlus5 = numB == (numA + 5);
            final boolean numCArebetweenAPlus1AndLess3 = (
                    numC >= (numA - 3) && numC <= (numA + 1)
            );
            if(numBAreAPlus5 && numCArebetweenAPlus1AndLess3) return true;
        }
        return false;
    }
}
