package exercices.codingbat.warmup_1;

public class FrontBack {
    public static void main(String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
    }
    public static String frontBack(String str) {
        final int length = str.length();
        if(length <= 1) return str;
        if(length == 2) String.valueOf(str.charAt(length - 1) + str.charAt(0));
        return str.charAt(length - 1) + str.substring(1, length - 1) + str.charAt(0);
    }
    public static String frontBack_S(String str) {
        if (str.length() <= 1) return str;
        String mid = str.substring(1, str.length()-1);
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }
}
