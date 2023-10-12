package cursos.alura._1_0_oo.banco.models;

import cursos.alura._1_0_oo.banco.models.documento.CNPJ;
import cursos.alura._1_0_oo.banco.models.documento.Documento;

public class Divida {

	private double total;
	private Pessoa credor;
	private Pagamentos pagamentos;

	public Divida() {
		super();
		this.credor = new Pessoa(null, null);
	}

	public Divida(final Pessoa credor, final double total) {
		super();
		this.credor = credor;
		this.total = total;
		this.pagamentos = new Pagamentos();
	}

	public Divida(final CNPJ cnpjDoCredor, final double total) {
		super();
		this.credor = new Pessoa(null, cnpjDoCredor);
		this.total = total;
		this.pagamentos = new Pagamentos();
	}

	public Pessoa getCredor() {
		return this.credor;
	}

	public Documento getDocumentoCredor() {
		return this.credor.getDocumento();
	}

	public double getTotal() {
		return this.total;
	}

	public void setCredor(String credor) {
		this.credor.setNome(credor);
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public void registrar(Pagamento pagamento) {
		this.pagamentos.registrar(pagamento);
	}

	public double getValorPago() {
		return pagamentos.getValorPago();
	}
}
