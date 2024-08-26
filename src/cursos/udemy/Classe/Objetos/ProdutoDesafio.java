package curso.Classe.Objetos;

public class ProdutoDesafio {
	public static void main(String[] args) {
		exampleII();
	}
	static void exampleII() {
		Produto[] produtos = {
				new  Produto("Notebook", 4356.89),
				new  Produto("Caneta Preta", 12.56)
		};
		Produto.desconto = 0.29;
		for (Produto produto : produtos) {
			System.out.println(
					"Nome:\t\t" + produto.nome
					+ "\nDesconto:\t" + Produto.desconto
					+ "\nPreço:\t\t" + String.format("%.2f", produto.precoFinal())
			);
		}
	}
}
