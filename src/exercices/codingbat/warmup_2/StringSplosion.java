package exercices.codingbat.warmup_2;

public class StringSplosion {
    public String stringSplosion(String str) {
        String result = "";
        for(int index = 0; index < str.length(); index++) {
            result = result + str.substring(0, index + 1);
        }
        return result;
    }
    public String stringSplosion_S(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
            result = result + str.substring(0, i+1);
        }
        return result;
    }
}
