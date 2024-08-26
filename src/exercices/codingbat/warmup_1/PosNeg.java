package exercices.codingbat.warmup_1;

public class PosNeg {
    public static void main(String[] args) {
        System.out.println(posNeg(1, -1, false));
        System.out.println(posNeg(-1, 1, false));
        System.out.println(posNeg(-4, -5, true));
    }
    public static boolean posNeg(int a, int b, boolean negative) {
        int onlySignA = a/(Math.abs(a));
        int onlySignB = b/(Math.abs(b));
        if(negative) return (a < 0) && (b < 0);
        return onlySignA != onlySignB;
    }
    public boolean posNeg_S(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }
        else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }
}
