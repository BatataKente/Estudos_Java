package exercices.codingbat.warmup_2;

public class Last2 {
    public static void main(String[] args) {
        System.out.println(last2("xxxx"));
    }
    public static int last2(String str) {
        final int strLength = str.length();
        if(strLength <= 2) return 0;
        final String lastTwoSubstring = str.substring(strLength - 2, strLength);
        final String notLastTwoSubstring = str.substring(0, strLength - 1);
        int result = 0;
        for(int index = 0; index < notLastTwoSubstring.length() - 1; index++) {
            final boolean matchLastwoSubstrings = (
                    notLastTwoSubstring.substring(index, index + 2).equals(lastTwoSubstring)
            );
            if(matchLastwoSubstrings) result++;
        }
        return result;
    }
    public static int last2_S(String str) {
        if (str.length() < 2) return 0;
        String end = str.substring(str.length()-2);
        int count = 0;
        for (int i=0; i<str.length()-2; i++) {
            String sub = str.substring(i, i+2);
            if (sub.equals(end)) {
                count++;
            }
        }
        return count;
    }
}
