package cursos.alura._1_2_design_patterns.desconto;

import cursos.alura._1_2_design_patterns.Orcamento;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super();
	}

	@Override
	public double aplicar(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setNext(Desconto desconto) {}
}
