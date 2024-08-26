package cursos.alura._1_2_design_patterns._1.imposto;

import cursos.alura._1_2_design_patterns._1.Orcamento;

public abstract class ImpostoCondicional extends Imposto {

	public ImpostoCondicional(Imposto next) {
		super(next);
	}
	
	public ImpostoCondicional() {
		super(null);
	}

	@Override
	public final double calcular(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)) return maximaTaxacao(orcamento) + calcularNextImposto(orcamento);
		return minimaTaxacao(orcamento) + calcularNextImposto(orcamento);
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);
	protected abstract double maximaTaxacao(Orcamento orcamento);
	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
}
