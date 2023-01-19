package Lambdas;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		Predicate<Produto> isExpensive = produto -> produto.preco*(1-produto.desconto) >= 750;
		var produto = new Produto("Notebook", 3893.89, 0.15);
		System.out.println(isExpensive.test(produto));
	}
}
