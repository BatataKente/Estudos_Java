package Classe.Objetos;

public class Produto {
	final String nome;
	double preco;
	static double desconto;
	public Produto() {
		this.nome = "?";
	}
	Produto(String nome) {
		this.nome = nome;
	}
	Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	double precoFinal() {
		return precoComDesconto(preco, desconto);
	}
	double precoFinal(double descontoDoGerente) {
		return precoComDesconto(preco, desconto + descontoDoGerente);
	}
	private double precoComDesconto(double preco, double desconto) {
		return preco * (1 - desconto);
	}
}
