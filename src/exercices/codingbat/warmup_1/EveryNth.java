package exercices.codingbat.warmup_1;

public class EveryNth {
    public String everyNth(String str, int n) {
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            if(i % n != 0) continue;
            result = result + str.charAt(i);
        }
        return result;
    }
    public String everyNth_S(String str, int n) {
        String result = "";
        for (int i=0; i<str.length(); i = i + n) {
            result = result + str.charAt(i);
        }
        return result;
    }
}
