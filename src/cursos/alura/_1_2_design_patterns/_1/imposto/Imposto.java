package cursos.alura._1_2_design_patterns._1.imposto;

import cursos.alura._1_2_design_patterns._1.Orcamento;

public abstract class Imposto {

	protected final Imposto next;
	
	public Imposto(final Imposto next) {
		this.next = next;
	}
	
	public abstract double calcular(final Orcamento orcamento);

	protected double calcularNextImposto(final Orcamento orcamento) {
		if(next == null) return 0;
		return next.calcular(orcamento);
	}
}
