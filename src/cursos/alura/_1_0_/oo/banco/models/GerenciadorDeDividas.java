package cursos.alura._1_0_.oo.banco.models;

public class GerenciadorDeDividas {
	
	public void efetuaPagamento(
			final PessoaJuridica pagador, 
			final Divida divida, 
			final double valor
	) {
		divida.registrar(new Pagamento(pagador, valor));
	}
}
