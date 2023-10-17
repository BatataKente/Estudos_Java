package cursos.alura._1_1_SOLID.acoplamento._2;

public class CalculadoraDePrecos {

	final TabelaDePreco tabelaDePreco;
	final ServicoDeEntrega servicoDeEntrega;
	
	public CalculadoraDePrecos(
			final TabelaDePreco tabelaDePreco,
			final ServicoDeEntrega servicoDeEntrega
	) {
		this.tabelaDePreco = tabelaDePreco;
		this.servicoDeEntrega = servicoDeEntrega;
	}
	
    public double calcula(Compra produto) {

        double desconto = tabelaDePreco.descontoPara(produto.getValor());
        double frete = servicoDeEntrega.para(produto.getCidade());

        return produto.getValor() * (1-desconto) + frete;
    }
}