package cursos.alura._1_2_design_patterns._1.desconto;

import cursos.alura._1_2_design_patterns._1.Orcamento;

public class DescontoPorMaisDeQuinhentos extends Desconto {

	public DescontoPorMaisDeQuinhentos() {
		super();
	}
	
	public DescontoPorMaisDeQuinhentos(Desconto next) {
		super(next);
	}

	@Override
	public double aplicar(final Orcamento orcamento) {
		if(orcamento.getValor() > 500) return orcamento.getValor()*0.07;
		return next.aplicar(orcamento);
	}
}
