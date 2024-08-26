package exercices.codingbat.warmup_1;

public class Diff21 {
    public static void main(String[] args) {
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
    }
    public static int diff21(int n) {
        int diff = 21 - n;
        return diff > 0? diff : (diff*2*(-1));
    }
}
