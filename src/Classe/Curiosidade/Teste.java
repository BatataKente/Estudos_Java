package Classe.Curiosidade;

import Classe.Produto.Produto;

public class Teste {
	public static void main(String[] args) {
		test1();
		test2();
	}
	static void test1() {
		var  firstProduto = new Produto();
		System.out.println(firstProduto);
		var  sameProduto = firstProduto;
		System.out.println(sameProduto + "\n");
	}
	static void test2() {
		var  firstProduto = new Produto();
		System.out.println(firstProduto);
		var  secondProduto = new Produto();
		System.out.println(secondProduto + "\n");
	}
}
