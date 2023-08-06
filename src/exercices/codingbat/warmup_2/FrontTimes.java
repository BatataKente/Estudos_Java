package exercices.codingbat.warmup_2;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        final int length = str.length();
        final int cutSize = length < 3? length : 3;
        final String cut = str.substring(0, cutSize);
        String result = "";
        for(; n > 0; n--) {
            result = result + cut;
        }
        return result;
    }
    public String frontTimes_S(String str, int n) {
        int frontLen = 3;
        if (frontLen > str.length()) {
            frontLen = str.length();
        }
        String front = str.substring(0, frontLen);
        String result = "";
        for (int i=0; i<n; i++) {
            result = result + front;
        }
        return result;
    }
}
