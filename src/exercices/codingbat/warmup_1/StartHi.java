package exercices.codingbat.warmup_1;

public class StartHi {
    public static void main(String[] args) {
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));
    }
    public static boolean startHi(String str) {
        if(str.length() < 2) return false;
        final String substring = str.substring(0, 2);
        return substring.equals("hi");
    }
    public boolean startHi_S(String str) {
        if (str.length() < 2) return false;
        String firstTwo = str.substring(0, 2);
        if (firstTwo.equals("hi")) {
            return true;
        } else {
            return false;
        }
    }
}
