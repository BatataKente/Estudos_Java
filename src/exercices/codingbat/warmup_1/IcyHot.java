package exercices.codingbat.warmup_1;

public class IcyHot {
    public static void main(String[] args) {
        System.out.println(icyHot(120, -1));
        System.out.println(icyHot(-1, 120));
        System.out.println(icyHot(2, 120));
    }
    public static boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 ^ temp2 < 0) && (temp1 > 100 ^ temp2 > 100);
    }
    public static boolean icyHot_S(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean icyHot_2(int temp1, int temp2) {
        if (temp1 < 0 && temp2 > 100) return true;
        if (temp1 > 100 && temp2 < 0) return true;
        return false;
    }
}
