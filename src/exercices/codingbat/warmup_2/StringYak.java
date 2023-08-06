package exercices.codingbat.warmup_2;

public class StringYak {
    //replace não existe nas versões antigas do java
     public String stringYak(String str) {
       return str.replace("yak", "");
     }

    public String stringYak_S(String str) {
        final int length = str.length();
        String result = "";
        for (int i = 0; i < length; i++) {
            if (i + 2 < length && str.charAt(i) == 'y' && str.charAt(i+2)=='k') {
                i += 2;
            } else {
                result = result + str.charAt(i);
            }
        }
        return result;
    }
}
