package cursos.alura._1_0_oo.banco.models;

import cursos.alura._1_0_oo.banco.models.documento.CNPJ;

public class BalancoEmpresa {
	
	private final ArmazenadorDeDividas dividas;

	public BalancoEmpresa(final ArmazenadorDeDividas dividas) {
		this.dividas = dividas;
	}
	
	public void registrarDivida(
			final Divida divida
	) {
		dividas.salvar(divida);
	}
	
	public void registraDivida(
			final CNPJ credor,
			final double valor
	) {
		Divida divida = new Divida(credor, valor);
		dividas.salvar(divida);
	}
	
	public void registraDivida(
			final Pessoa credor,
			final double valor
	) {
		Divida divida = new Divida(credor, valor);
		dividas.salvar(divida);
	}
	
	public void pagarDivida(
			final Pessoa pagador, 
			final Pessoa credor, 
			final double valor
	) {
		Divida divida = dividas.carregar(credor.getDocumento());
		divida.registrar(new Pagamento(pagador, valor));
	}
	
	public void pagarDivida(
			final CNPJ cnpjDoCredor, 
			final Pagamento pagamento
	) {
		Divida divida = dividas.carregar(cnpjDoCredor);
		if(divida == null) return;
		divida.registrar(pagamento);
		dividas.salvar(divida);
	}
}
