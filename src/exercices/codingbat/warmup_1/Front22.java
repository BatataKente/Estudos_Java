package exercices.codingbat.warmup_1;

public class Front22 {
    public static void main(String[] args) {
        System.out.println(front22("kitten"));
        System.out.println(front22("Ha"));
        System.out.println(front22("abc"));
    }
    public static String front22(String str) {
        if(str.length() <= 2) return str + str + str;
        final String substring = str.substring(0, 2);
        return substring + str + substring;
    }
    public static String front22_S(String str) {
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }
        String front = str.substring(0, take);
        return front + str + front;
    }
}
