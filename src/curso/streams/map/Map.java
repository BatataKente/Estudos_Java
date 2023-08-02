package curso.streams.map;

import curso.streams.Utilitários;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		marcas.stream()
			.map(marca -> marca.toUpperCase())
			.forEach(print);
//		UnaryOperator<String> paraMaiusculo = element -> element.toUpperCase();
//		UnaryOperator<String> primeiraLetra = element -> {
//			return Character.toString(element.charAt(0));
//		};
//		UnaryOperator<String> grito = element -> element + "!!! ";
//		System.out.println(
//				paraMaiusculo
//					.andThen(primeiraLetra)
//					.andThen(grito)
//					.apply("Lero Lero")
//		);
		System.out.print("\n\nUsando composição...\n");
		marcas.stream()
			.map(Utilitários.paraMaiusculo)
			.map(Utilitários.primeiraLetra)
			.map(Utilitários::grito)
			.forEach(print);
	}
}
