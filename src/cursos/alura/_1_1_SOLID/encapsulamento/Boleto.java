package cursos.alura._1_1_SOLID.encapsulamento;

public class Boleto {

    private final double valor;
    public Boleto(final double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
