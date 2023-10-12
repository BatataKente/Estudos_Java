package cursos.alura._1_2_design_patterns.desconto;

import cursos.alura._1_2_design_patterns.Orcamento;

public abstract class Desconto {

	protected Desconto next;
	
	public Desconto() {
	}
	
	public Desconto(final Desconto next) {
		setNext(next);
	}
	
	public abstract double aplicar(final Orcamento orcamento);

	public void setNext(Desconto desconto) {
		this.next = desconto;
	}
}
