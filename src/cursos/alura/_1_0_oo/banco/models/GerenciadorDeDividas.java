package cursos.alura._1_0_oo.banco.models;

public class GerenciadorDeDividas {
	
	public void efetuaPagamento(
			final Pessoa pagador, 
			final Divida divida, 
			final double valor
	) {
		divida.registrar(new Pagamento(pagador, valor));
	}
}
