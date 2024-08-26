package exercices.codingbat.warmup_2;

public class Array123 {
    public boolean array123(int[] nums) {
        String sentence = "";
        for(int index = 0; index < nums.length; index++) {
            sentence = sentence + nums[index];
        }
        final boolean notHas123 = sentence.indexOf("123") == -1;
        return !notHas123;
    }
    public boolean array123_2(int[] nums) {
        String sentence = "";
        for(int index = 0; index < nums.length; index++) {
            sentence = sentence + nums[index];
            final boolean has123 = !(sentence.indexOf("123") == -1);
            if(has123) return true;
        }
        return false;
    }

    public boolean array123_S(int[] nums) {
        for (int i=0; i < (nums.length-2); i++) {
            if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
        }
        return false;
    }
}
