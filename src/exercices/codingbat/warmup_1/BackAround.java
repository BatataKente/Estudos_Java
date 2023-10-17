package exercices.codingbat.warmup_1;

public class BackAround {
    public static void main(String[] args) {
        System.out.println(backAround("cat"));
        System.out.println(backAround("Hello"));
        System.out.println(backAround("a"));
    }
    public static String backAround(String str) {
        final char lastChar = str.charAt(str.length() - 1);
        return lastChar + str + lastChar;
    }
}
