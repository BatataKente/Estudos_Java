package exercices.codingbat.warmup_1;

public class NearHundred {
    public static void main(String[] args) {
        System.out.println(nearHundred(93));
        System.out.println(nearHundred(90));
        System.out.println(nearHundred(89));
    }
    public static boolean nearHundred(int n) {
        int diffA = 100 - n;
        int diffB = 200 - n;
        return (Math.abs(diffA) <= 10) || (Math.abs(diffB) <= 10);
    }
}
