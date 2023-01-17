package Lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEachTeste {
	public static void main(String[] args) {
		test_1();
	}
	static void printName(String nome) {
		System.out.println("Oi meu nome é " + nome);
	}
	static void test_1() {
		List<String> aprovados = Arrays.asList(
				"Josicleison", "Josicleide", "Mickael Jackson", "Godolfredo"
		);
		System.out.println("-> Forma tradicional");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		System.out.println("\n-> Lambda_1");
		aprovados.forEach((nome) -> System.out.println(nome));
		System.out.println("\n-> Method Reference_1");
		aprovados.forEach(System.out::println);
		System.out.println("\n-> Lambda_2");
		aprovados.forEach((nome) -> printName(nome));
		System.out.println("\n-> Method Reference_2");
		aprovados.forEach(ForEachTeste::printName);
	}
}
