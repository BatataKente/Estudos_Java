package cursos.alura._1_2_design_patterns._1.desconto;

import cursos.alura._1_2_design_patterns._1.Orcamento;

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
