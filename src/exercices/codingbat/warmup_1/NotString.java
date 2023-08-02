package exercices.codingbat.warmup_1;

public class NotString {
    public static void main(String[] args) {
        System.out.println(notString("candy"));
        System.out.println(notString("x"));
        System.out.println(notString("not bad"));
    }
    public static String notString(String str) {
        if(
            str.length() >= 3 &&
                str.charAt(0) == 'n' &&
                str.charAt(1) == 'o' &&
                str.charAt(2) == 't'
        ) {
            return str;
        }
        return "not " + str;
    }
    public static String notString_S(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }
}
