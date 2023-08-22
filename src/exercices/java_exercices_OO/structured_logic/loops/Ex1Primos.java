package exercices.java_exercices_OO.structured_logic.loops;

public class Ex1Primos {
    private int number;
    public Ex1Primos(int n) {
        this.number = n;
    }
    static void showPrimesAtInterval(int min, int max) {
        for (; min < max; min++) {
            String current = getIfPrime(min);
            if(current == "") continue;
            System.out.print(current + " ");
        }
    }
    String getIfPrime() {
        if(numberIsPrime()) return String.valueOf(number);
        return "";
    }
    static String getIfPrime(int number) {
        if(numberIsPrime(number)) return String.valueOf(number);
        return "";
    }
    void showNumberIsPrime() {
        showNumberIsPrime(number);
    }
    static void showNumberIsPrime(int number) {
        String isPrime = numberIsPrime(number)? "Sim" : "Não";
        System.out.println(number + " é primo? " + isPrime);
    }
    boolean numberIsPrime() {
        return numberIsPrime(number);
    }
    static boolean numberIsPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        for (int counter = 2; counter <= Math.sqrt(number); counter++) {
            if (number % counter == 0) return false;
        }
        return true;
    }
    public String toString() {
        return String.valueOf(number);
    }
}
