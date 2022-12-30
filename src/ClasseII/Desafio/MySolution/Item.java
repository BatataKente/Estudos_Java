package ClasseII.Desafio.MySolution;

public class Item {
	private final Produto produto;
	int quantidade;
	public Item(int quantidade, String nome, double preco) {
		this.produto = new Produto(nome, preco);
		this.quantidade = quantidade;
	}
	double getPrecoTotal() {
		return produto.preco*quantidade;
	}
}
