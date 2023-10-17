package exercices.codingbat.warmup_1;

public class Max1020 {
    public int max1020(int a, int b) {
        final boolean aIsInRange1020 = a >= 10 && a <= 20;
        final boolean bIsInRange1020 = b >= 10 && b <= 20;
        if(!aIsInRange1020 && !bIsInRange1020) return 0;
        if(!aIsInRange1020) return b;
        if(!bIsInRange1020) return a;
        if(a > b) return a;
        return b;
    }
    public int max1020_S(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }
}
