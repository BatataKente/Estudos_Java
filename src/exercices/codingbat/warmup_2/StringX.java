package exercices.codingbat.warmup_2;

public class StringX {
     public String stringX(String str) {
       String result = "";
       for(int i = 0; i < str.length(); i++) {
         final char letter = str.charAt(i);
         if(letter == 'x' && i != str.length() - 1 && i != 0) continue;
         result = result + letter;
       }
       return result;
     }
     public String stringX_s(String str) {
       String result = "";
       for (int i=0; i<str.length(); i++) {
         if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
           result = result + str.substring(i, i+1);
         }
       }
       return result;
     }
    public String stringX_1(String str) {
        final int length = str.length();
        if(length <= 1) return str;
        final char firstLetter = str.charAt(0);
        final char lastLetter = str.charAt(length - 1);
        String midWord = "";
        for(int i = 1; i < length - 1; i++) {
            final char letter = str.charAt(i);
            if(letter == 'x') continue;
            midWord = midWord + letter;
        }
        return firstLetter + midWord + lastLetter;
    }
}
