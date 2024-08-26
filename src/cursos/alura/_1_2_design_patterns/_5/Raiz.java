package cursos.alura._1_2_design_patterns._5;

public class Raiz extends Operacao {

	public Raiz(Expressao left) {
		super(left, null);
	}

	@Override
	public int resolver() {
		return (int) (Math.sqrt(getLeft().resolver()));
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitRaiz(this);
	}
}
