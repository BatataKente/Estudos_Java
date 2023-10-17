package cursos.alura._1_2_design_patterns._4;

public class State {
	
	private final Contrato contrato;

	public State(Contrato contrato) {
		super();
		this.contrato = contrato;
	}

	public Contrato getState() {
		return contrato;
	}
}