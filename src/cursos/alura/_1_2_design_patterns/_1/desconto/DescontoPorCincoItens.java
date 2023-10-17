package cursos.alura._1_2_design_patterns._1.desconto;

import cursos.alura._1_2_design_patterns._1.Orcamento;

public class DescontoPorCincoItens extends Desconto {

	public DescontoPorCincoItens() {
		super();
	}


	public DescontoPorCincoItens(Desconto next) {
		super(next);
	}

	@Override
	public double aplicar(final Orcamento orcamento) {
		if(orcamento.getItems().size() > 5) return orcamento.getValor()*0.1;
		return next.aplicar(orcamento);
	}
}
