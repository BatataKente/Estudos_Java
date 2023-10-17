package exercices.codingbat.warmup_1;

public class IntMax {
    public static void main(String[] args) {
    }
    private static int intMax(int a, int b, int c) {
        if(a > b && a > c) return a;
        if(b > a && b > c) return b;
        return c;
    }
    private static int intMax_S(int a, int b, int c) {
        int max;
        if (a > b) {
         max = a;
        } else {
         max = b;
        }
        if (c > max) {
         max = c;
        }
        return max;
    }
}
