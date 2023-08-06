package exercices.codingbat.warmup_1;

public class StartOz {
    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));
    }
    public static String startOz(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        if(str.length() == 0)
            return "";
        if(str.charAt(0) == 'o')
            sb.append("o");
        if(str.length() > 1 && str.charAt(1) == 'z')
            sb.append("z");
        return sb.toString();
    }
    public static String startOz_S(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }
        return result;
    }
}
