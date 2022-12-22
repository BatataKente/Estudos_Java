package Classe.Produto;

public class Produto {
	final String nome;
	final double preco;
	double desconto;
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	double precoFinal() {
		return precoComDesconto(preco, desconto);
	}
	double precoComDesconto(double preco, double desconto) {
		return preco * (1 - desconto);
	}
}
