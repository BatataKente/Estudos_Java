package exercices.codingbat.warmup_1;

import java.util.Arrays;

public class HasTeen {
    public static void main(String[] args) {
        System.out.println(hasTeen(13, 20, 10));
        System.out.println(hasTeen(20, 19, 10));
        System.out.println(hasTeen(20, 10, 13));
        System.out.println(hasTeen(20, 10, 13, 14, 19));
    }
    public static boolean hasTeen(int a, int b, int c) {
        final int[] numbers = {a, b, c};
        return Arrays.stream(numbers).anyMatch(number -> number >= 13 && number <= 19);
    }
    public static boolean hasTeen(int... numbers) {
        return Arrays.stream(numbers).anyMatch(number -> number >= 13 && number <= 19);
    }
    public boolean hasTeen_S(int a, int b, int c) {
        return (a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19);
    }
}
