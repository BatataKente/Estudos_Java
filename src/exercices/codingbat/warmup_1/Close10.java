package exercices.codingbat.warmup_1;

public class Close10 {
    public static void main(String[] args) {
    }
    private static int close10(int a, int b) {
        final int diffA = Math.abs(a - 10);
        final int diffB = Math.abs(b - 10);
        if(diffA == diffB) return 0;
        if(diffA < diffB) return a;
        return b;
    }
    private int close10_S(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);
        if (aDiff < bDiff) {
        return a;
        }
        if (bDiff < aDiff) {
        return b;
        }
        return 0;
    }
}
