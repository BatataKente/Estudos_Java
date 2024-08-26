package exercices.codingbat.warmup_2;

public class DoubleX {
    public static void main(String[] args) {
        System.out.println(doubleX_2("catxax"));
    }
    private static boolean doubleX(String str) {
        boolean result = false;
        for( int i = 0; i < str.length() - 1; i++) {
            final char letter = str.charAt(i);
            final char nextLetter = str.charAt(i + 1);
            final boolean firstLetterIsX = letter == 'x';
            final boolean secondLetterIsX = nextLetter == 'x';
            if(firstLetterIsX && !secondLetterIsX) {
                result = false; break;
            }
            if(firstLetterIsX && secondLetterIsX) {
                result = true; break;
            }
        }
        return result;
    }
    private static boolean doubleX_S(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false;
        if (i+1 >= str.length()) return false;
        return str.substring(i+1, i+2).equals("x");
    }
    private static boolean doubleX_2(String str) {
        int indexOfXX = str.indexOf("xx");
        int indexOfX = str.indexOf("x");
        if(indexOfXX == -1) return false;
        return indexOfXX == indexOfX;
    }
}
