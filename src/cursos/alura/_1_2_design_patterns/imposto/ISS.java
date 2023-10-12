package cursos.alura._1_2_design_patterns.imposto;

import cursos.alura._1_2_design_patterns.Orcamento;

public class ISS extends Imposto {

	public ISS(final Imposto next) {
		super(next);
	}
	
	@Override
	public double calcular(final Orcamento orcamento) {
		return (orcamento.getValor() * 0.06) + calcularNextImposto(orcamento);
	}
}
