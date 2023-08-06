package exercices.codingbat.warmup_1;

public class In3050 {
    public static void main(String[] args) {
    }
    public boolean in3050(int a, int b) {
        final boolean aInRange3040 = a >= 30 && a <= 40;
        final boolean bInRange3040 = b >= 30 && b <= 40;
        final boolean aInRange4050 = a >= 40 && a <= 50;
        final boolean bInRange4050 = b >= 40 && b <= 50;
        if(aInRange3040 && bInRange3040) return true;
        if(aInRange4050 && bInRange4050) return true;
        return false;
    }
    public boolean in3050_S(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
         return true;
        }
        if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
         return true;
        }
        return false;
    }
}
