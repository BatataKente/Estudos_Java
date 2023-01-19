package Lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		teste();
	}
	static void teste() {
		Function<Produto, Double> preçoÁVista = produto -> {
			return produto.preco*(1-produto.desconto);
		};
		UnaryOperator<Double> imposto = preco -> preco > 2500 ?  preco * 1.085 : preco;
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		var iPobre = new Produto("iPobre", 199, 0.2);
//		var ipad = new Produto("iPad", 3235.89, 0.13);
		var result = imposto
				.compose(frete)
				.apply(preçoÁVista.apply(iPobre));
		
		System.out.printf("R$ %.2f\n", result);
	}
}
