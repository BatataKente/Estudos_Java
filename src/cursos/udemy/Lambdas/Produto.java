package curso.Lambdas;

public class Produto {
	final String nome;
	final double preco, desconto;
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	@Override public String toString() {
		return "Nome: " + nome + "\tPreco: " + String.format("%.2f", preco * (1 - desconto));
	}
}
