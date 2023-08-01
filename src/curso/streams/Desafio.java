package curso.streams;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		var números = new ArrayList<Integer>();
		var continuar = true;
		do {
			System.out.print("Informe um número: ");
			var número = input.nextInt();
			números.add(número);
			continuar = doYouDesireToProceed();
		} while(continuar);
		System.out.println("Printando os números pares e maiores ou iguais a zero em ordem crescente...");
		números.stream()
			.filter(a -> a >= 0)
			.filter(a -> a%2 == 0)
			.sorted()
			.map(a -> a + " é um número par.")
			.forEach(System.out::println);;
		input.close();
	}
	private static boolean doYouDesireToProceed() {
		while (true) {
			System.out.print("Deseja continuar (S/N)? ");
			var desejoDeContinuar = input.next();
			if (desejoDeContinuar.equalsIgnoreCase("s")) {
				return true;
			} else if (desejoDeContinuar.equalsIgnoreCase("n")) {
				return false;
			} else {
				System.out.println(desejoDeContinuar + "? ... Não tem essa opção.");
			}
		}
	}
}
