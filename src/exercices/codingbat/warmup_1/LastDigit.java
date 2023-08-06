package exercices.codingbat.warmup_1;

public class LastDigit {
    public boolean lastDigit(int a, int b) {
        final int aRestOfTen = a % 10;
        final int bRestOfTen = b % 10;
        return aRestOfTen == bRestOfTen;
    }

    public boolean lastDigit_S(int a, int b) {
        return(a % 10 == b % 10);
    }
}
