package cursos.alura._1_0_.oo;

public class Pagamento {
	
	private final PessoaJuridica pagador;
	private final double valor;
	
	public Pagamento(
			final PessoaJuridica pagador, 
			final double valor
	) {
		super();
		this.pagador = pagador;
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}
}
