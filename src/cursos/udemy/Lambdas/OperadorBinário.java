package curso.Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinário {
	public static void main(String[] args) {
		BinaryOperator<Double> media = (a, b) -> (a + b)/2;
		BiFunction<Double, Double, String> resultado = (a, b) -> {
			 return media.apply(a, b)  >= 7 ? "Aprovado": "Reprovado";
		};
		Function<Double, String> conceito = nota -> {
			return nota >= 7 ? "Aprovado": "Reprovado";
		};
		System.out.println(media.apply(5.7, 9.8));
		System.out.println(resultado.apply(5.7, 9.8));
		System.out.printf(
				media
					.andThen(conceito)
					.apply(9.7, 4.1)
		);
	}
}
