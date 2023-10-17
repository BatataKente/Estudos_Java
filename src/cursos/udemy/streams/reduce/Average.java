package curso.streams.reduce;

public class Average {
    private double total;
    private int quantidade;
    Average add(double valor) {
        total += valor;
        quantidade++;
        return this;
    }
    double getValue() {
        return total/quantidade;
    }
    @Override
    public String toString() {
        return String.valueOf(total/quantidade);
    }
}
