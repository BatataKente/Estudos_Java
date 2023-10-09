package cursos.alura._1_0_.oo;

public class GerenciadorDeDividas {
	
	public void efetuaPagamento(
			final PessoaJuridica pagador, 
			final Divida divida, 
			final double valor
	) {
		divida.registra(new Pagamento(pagador, valor));
	}
}
