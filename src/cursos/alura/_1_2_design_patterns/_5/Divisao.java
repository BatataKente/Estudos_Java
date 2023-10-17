package cursos.alura._1_2_design_patterns._5;

public class Divisao  extends Operacao {

	public Divisao(Expressao left, Expressao right) {
		super(left, right);
	}

	@Override
	public int resolver() {
		return getLeft().resolver() / getRight().resolver();
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitDivisao(this);
	}
}
