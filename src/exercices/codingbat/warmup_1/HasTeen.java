package exercices.codingbat.warmup_1;

import java.util.Arrays;

public class HasTeen {
    public static void main(String[] args) {
<<<<<<< HEAD
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
=======
        System.out.println(hasTeen_S(13, 20, 10));
        System.out.println(hasTeen_S(20, 19, 10));
        System.out.println(hasTeen_S(20, 10, 13));
//        System.out.println(hasTeen(20, 10, 13, 14, 19));
    }
//    public static boolean hasTeen(int a, int b, int c) {
//        final int[] numbers = {a, b, c};
//        return Arrays.stream(numbers).anyMatch(number -> number >= 13 && number <= 19);
//    }
//    public static boolean hasTeen(int... numbers) {
//        return Arrays.stream(numbers).anyMatch(number -> number >= 13 && number <= 19);
//    }
    public static boolean hasTeen_S(int a, int b, int c) {
>>>>>>> 0d622eb1303a0fe7187e95d7aa65703584a35788
        return (a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19);
    }
}
