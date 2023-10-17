package cursos.alura._1_2_design_patterns._5;

public class Numero implements Expressao {

	private final int numero;
	
	public Numero(final int numero) {
		this.numero = numero;
	}

	@Override
	public int resolver() {
		return numero;
	}
	
	public int getValue() {
		return numero;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitNumero(this);
	}
}
