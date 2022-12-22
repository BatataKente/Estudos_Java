package Classe.Produto;

public class Produto {
	String nome;
	double preco, desconto;
	double precoFinal() {
		return preco * (1 - desconto);
	}
}
