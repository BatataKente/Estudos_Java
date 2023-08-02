package exercices.codingbat.warmup_1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingChar {
    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten", 4));
    }
    public static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1, str.length());
    }
    public static String missingChar_S(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1, str.length());
        return front + back;
    }
}
