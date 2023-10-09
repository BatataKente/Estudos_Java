package cursos.alura._1_0_.oo.banco.models;

public class Divida {

	private double total;
	private final PessoaJuridica credor;
	private final Pagamentos pagamentos;

	public Divida(final PessoaJuridica credor, final double total) {
		super();
		this.credor = credor;
		this.total = total;
		this.pagamentos = new Pagamentos();
	}

	public Divida(final CNPJ cnpjDoCredor, final double total) {
		super();
		this.credor = new PessoaJuridica(null, cnpjDoCredor);
		this.total = total;
		this.pagamentos = new Pagamentos();
	}

	public PessoaJuridica getCredor() {
		return this.credor;
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
