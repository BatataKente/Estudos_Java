package exercices.codingbat.warmup_2;

public class CountXX {
    int countXX(String str) {
        final int length = str.length();
        int result = 0;
        for(int i = 0; i < length - 1; i++) {
            if(str.substring(i, i + 2).equals("xx")) result++;
        }
        return result;
    }
    int countXX_S(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("xx")) count++;
        }
        return count;
    }
}
