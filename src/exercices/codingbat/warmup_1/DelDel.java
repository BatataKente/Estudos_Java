package exercices.codingbat.warmup_1;

public class DelDel {
    public static void main(String[] args) {
        System.out.println(delDel("adelbc"));
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("adedbc"));
    }
    public static String delDel(String str) {
        if(str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.replace("del", "");
        }
        return str;
    }
}
