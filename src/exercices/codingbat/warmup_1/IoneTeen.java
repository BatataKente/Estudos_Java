package exercices.codingbat.warmup_1;

public class IoneTeen {
    public static void main(String[] args) {
        System.out.println(loneTeen(13, 99));
        System.out.println(loneTeen(21, 19));
        System.out.println(loneTeen(13, 13));
    }
    public static boolean loneTeen(int a, int b) {
        return (13 <= a && a <= 19) ^ (13 <= b && b <= 19);
    }
    public static boolean loneTeen_1(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        if (aTeen && !bTeen) return true;
        if (!aTeen && bTeen) return true;
        return false;
    }
    public static boolean loneTeen_S(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }
}
