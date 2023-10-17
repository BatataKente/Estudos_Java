package cursos.alura._1_2_design_patterns._4;

import java.util.Calendar;

public class Contrato {

	private final Calendar data;
	private final String cliente;
	private TipoDeContrato tipo;
	
	public Contrato(
			final Calendar data, 
			final String cliente, 
			final TipoDeContrato tipo
	) {
		super();
		this.data = data;
		this.cliente = cliente;
		this.tipo = tipo;
	}

	public Calendar getData() {
		return data;
	}

	public String getCliente() {
		return cliente;
	}

	public TipoDeContrato getTipo() {
		return tipo;
	}
	
	public void next() {
		tipo = tipo.next();
	} 
	
	public State saveState() {
		return new State(new Contrato(data, cliente, tipo));
	}
}
