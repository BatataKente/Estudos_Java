package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@SuppressWarnings("unused")
public class ConsumidorTeste {
	public static void main(String[] args) {
		exercice_2();
	}
	private static void exercice_1() {
		Consumer<Produto> imprimir = produto -> System.out.println(produto.nome);
		var produto = new Produto("Caneta", 12.34, 0.09);
		imprimir.accept(produto);
	}
	private static void exercice_2() {
		Consumer<Produto> imprimir = produto -> {
			System.out.println(produto.nome);
		};
		var desconto = 0.1;
		List<Produto> produtos = Arrays.asList( 
				new Produto("NoteBook", 4312.89, desconto),
				new Produto("Chifre", 122.0, desconto),
				new Produto("Chinelo", 1.99, desconto),
				new Produto("Revólver", 2312.34, desconto)
		);
		produtos.forEach(imprimir);
		produtos.forEach(produto -> imprimir.accept(produto));
		produtos.forEach(System.out::println);
	}
	private static void mytest() {
		Consumer<String> imprimir = System.out::println;
		var produto = new Produto("Caneta", 12.34, 0.09);
		imprimir.accept(produto.nome);
	}
}
