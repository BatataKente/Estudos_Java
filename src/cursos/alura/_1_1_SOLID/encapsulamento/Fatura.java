package cursos.alura._1_1_SOLID.encapsulamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fatura {

	private final List<Pagamento> pagamentos;
	private final double valor;
	private boolean pago;
	
	public Fatura(
			final double valor
	) {
		this.pagamentos = new ArrayList<Pagamento>();
		this.pago = false;
		this.valor = valor;
	}
	
	public List<Pagamento> getPagamentos() {
		return Collections.unmodifiableList(pagamentos);
	}

	public double getValor() {
		return 0;
	}
	
	public boolean isPago() {
		return pago;
	}

	public void addPagamento(Pagamento pagamento) {
		pagamentos.add(pagamento);
		if(valorTotalDosPagamentos() > valor) {
			pago = true;
		}
	}

	private double valorTotalDosPagamentos() {
		return pagamentos.stream()
			.map(Pagamento::getValor)
			.reduce((acumulador, valor) -> acumulador + valor)
			.get();
	}
}
