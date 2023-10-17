package cursos.alura._1_2_design_patterns._1.imposto;

import cursos.alura._1_2_design_patterns._1.Orcamento;

public class ICPP extends ImpostoCondicional {

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*0.05;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*0.07;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}
}
