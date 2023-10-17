package cursos.alura._1_2_design_patterns._1.desconto;

import cursos.alura._1_2_design_patterns._1.Orcamento;

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
