package exercices.codingbat.warmup_1;

public class EndUp {
    public String endUp(String str) {
        final int length = str.length();
        if(length == 0) return str;
        if(length <= 3) return str.toUpperCase();
        final String leftSideOfSentence = str.substring(0, length - 3);
        final String rightSideOfSentence = str.substring(length - 3).toUpperCase();
        return leftSideOfSentence + rightSideOfSentence;
    }
    public String endUp_S(String str) {
        if (str.length() <= 3) return str.toUpperCase();
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back  = str.substring(cut);
        return front + back.toUpperCase();
    }
}
