package cursos.alura._1_2_design_patterns._7;

import java.util.Calendar;
import java.util.Date;

public class Pedido {
	
	private final String cliente;
	private final double valor;
	private Status status;

	public Pedido(
			final String cliente, 
			final double valor
	) {
		super();
		this.cliente = cliente;
		this.valor = valor;
		this.status = Status.NOVO;
	}
	
	public void pagar() {
		status = Status.PAGO;
	}
	
	public void finalizar() {
		final Date dataDeFinalizacao = Calendar.getInstance().getTime();
		status = Status.ENTREGUE;
	}

	public String getCliente() {
		return cliente;
	}
}
