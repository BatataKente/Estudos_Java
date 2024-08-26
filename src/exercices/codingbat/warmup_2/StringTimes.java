package exercices.codingbat.warmup_2;

public class StringTimes {
    public String stringTimes(String str, int n) {
        String result = "";
        for(; n > 0; n--) {
            result = result + str;
        }
        return result;
    }
    public String stringTimes_S(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + str;
        }
        return result;
    }
}
