package cursos.alura._1_0_oo.banco.models.movimentacao;

public class Pagamento {
	
	private String favorecido;
	private String formaDePagamento;
	private Movimentacao movimentacao = new Movimentacao();
	
	public Movimentacao getMovimentacao() {
		return movimentacao;
	}
	
	public String getFavorecido() {
		return favorecido;
	}
	
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	
	public void setFavorecido(String favorecido) {
		this.favorecido = favorecido;
	}
	
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
}