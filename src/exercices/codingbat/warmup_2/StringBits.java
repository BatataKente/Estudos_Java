package exercices.codingbat.warmup_2;

public class StringBits {
    public String stringBits(String str) {
        String result = "";
        for(int index = 0; index < str.length(); index += 2) {
            result = result + str.charAt(index);
        }
        return result;
    }
    public String stringBits_S(String str) {
        String result = "";
        for (int i=0; i<str.length(); i+=2) {
            result = result + str.substring(i, i+1);
        }
        return result;
    }
}
