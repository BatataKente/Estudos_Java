package exercices.codingbat.warmup_2;

public class AltPairs {
    public String altPairs(String str) {
        String result = "";
        int counter = 2;
        for(int i = 0; i < str.length(); i++) {
            if(counter == 4) counter = 0;
            final char letter = str.charAt(i);
            if(counter == 2 || counter == 3) {
                result = result + letter;
            }
            counter++;
        }
        return result;
    }
     public String altPairs_S(String str) {
       String result = "";
       for (int i=0; i<str.length(); i += 4) {
         int end = i + 2;
         if (end > str.length()) {
           end = str.length();
         }
         result = result + str.substring(i, end);
       }
       return result;
     }

}
