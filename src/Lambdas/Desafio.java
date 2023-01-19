package Lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
//		teste();
		solucao();
	}
	static void solucao () {
		Function<Produto, Double> precoFinal = produto -> {
			return produto.preco * (1 - produto.desconto);
		};
		UnaryOperator<Double> impostoMunicipal = preco -> {
			return preco >= 2500 ?  preco * 1.085 : preco;
		};
		UnaryOperator<Double> frete = preco -> {
			return preco >= 3000 ? preco + 100 : preco + 50;
		};
		Function<Double, String> arredondar = preco -> {
			return String.format("%.2f", preco);
		};
		UnaryOperator<String> formatar = preco -> "R$ " + preco;
		var iPad = new Produto("iPad", 3235.89, 0.5);
		var preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(iPad);
		System.out.println("O preço final é " + preco);
	}
	static void teste() {
		Function<Produto, Double> preçoÁVista = produto -> {
			return produto.preco*(1-produto.desconto);
		};
		UnaryOperator<Double> imposto = preco -> {
			return preco > 2500 ?  preco * 1.085 : preco;
		};
		UnaryOperator<Double> frete = preco -> {
			return preco >= 3000 ? preco + 100 : preco + 50;
		};
		var iPobre = new Produto("iPobre", 199, 0.2);
		var result = preçoÁVista
				.andThen(imposto)
				.andThen(frete)
				.apply(iPobre);	
		System.out.printf("R$ %.2f\n", result);
	}
}
