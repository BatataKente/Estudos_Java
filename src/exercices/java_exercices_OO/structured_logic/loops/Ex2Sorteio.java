package exercices.java_exercices_OO.structured_logic.loops;

public class Ex2Sorteio {
    static int generateNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
