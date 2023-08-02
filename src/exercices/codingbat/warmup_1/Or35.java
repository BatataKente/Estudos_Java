package exercices.codingbat.warmup_1;

public class Or35 {
    public static void main(String[] args) {
        System.out.println(or35(3));
        System.out.println(or35(10));
        System.out.println(or35(8));
    }
    public static boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }
    public static boolean or35_1(int n) {
        if(n % 5 == 0) return true;
        if(n % 3 == 0) return true;
        return false;
    }
    public static boolean or35_2(int n) {
        return n % 5 == 0? true : n % 3 == 0? true : false;
    }
}
