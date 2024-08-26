package cursos.alura._1_2_design_patterns._1.imposto;

import cursos.alura._1_2_design_patterns._1.Orcamento;

public class ISS extends Imposto {

	public ISS() {
		super(null);
	}

	public ISS(final Imposto next) {
		super(next);
	}
	
	@Override
	public double calcular(final Orcamento orcamento) {
		return (orcamento.getValor() * 0.06) + calcularNextImposto(orcamento);
	}
}
