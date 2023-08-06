package exercices.codingbat.warmup_1;

public class StringE {
    public boolean stringE(String str) {
        int numberOfELetters = 0;
        for(int i = 0; i < str.length(); i++) {
            final char letter = str.charAt(i);
            if(letter == 'e') numberOfELetters++;
        }
        return (numberOfELetters >= 1 && numberOfELetters <= 3);
    }
    public boolean stringE_S(String str) {
        int count = 0;
        for (int i=0; i<str.length(); i++) {
        if (str.charAt(i) == 'e') count++;
        }
        return (count >= 1 && count <= 3);
    }
}
