package cursos.alura._1_0_.oo;

import java.util.ArrayList;

public class Divida {
	
	private final double total;
	private final PessoaJuridica credor;
	private double valorpago;
	private ArrayList<Pagamento> pagamentos;
	
	public Divida(
			final PessoaJuridica credor, 
			final double total
	) {
		super();
		this.credor = credor;
		this.total = total;
	}

	private void pagar(final double valor) {
		if(valor < 0) throw new IllegalArgumentException("Valor inválido para pagamento.");
		double valorAPagar = valor;
		if(valorAPagar > 100) valorAPagar -= 8;
		valorpago += valorAPagar;
	}
	
	public void registra(Pagamento pagamento) {
		pagar(pagamento.getValor());
		pagamentos.add(pagamento);
	}

	public ArrayList<Pagamento> getPagamentos() {
		return pagamentos;
	}
}
