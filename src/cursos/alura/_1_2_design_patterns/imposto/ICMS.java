package cursos.alura._1_2_design_patterns.imposto;

import cursos.alura._1_2_design_patterns.Orcamento;

public class ICMS extends Imposto {

	public ICMS(Imposto next) {
		super(next);
	}

	public ICMS() {
		super(null);
	}

	@Override
	public double calcular(final Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + calcularNextImposto(orcamento);
	}
}
