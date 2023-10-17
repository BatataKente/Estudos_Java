package exercices.codingbat.warmup_1;

public class Front3 {
    public static void main(String[] args) {
        System.out.println(front3("Java"));
        System.out.println(front3("Chocolate"));
        System.out.println(front3("abc"));
    }
    public static String front3(String str) {
        final int range = str.length() >= 3? 3 : str.length();
        final String firstChars = str.substring(0, range);
        return firstChars + firstChars + firstChars;
    }
    public static String front3_S(String str) {
        String front;
        if (str.length() >= 3) {
            front = str.substring(0, 3);
        }
        else {
            front = str;
        }
        return front + front + front;
    }
}
