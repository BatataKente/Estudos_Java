package curso.Controle.Lacos;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String phrase = null;
		do {
			System.out.print(
					"Você precisa falar as palavras mágicas..."
			);
			System.out.print("\nQuer sair? ");
			phrase = input.nextLine();
		} while (!phrase.equalsIgnoreCase("por favor"));
		System.out.print("Obrigado!");
		input.close();
	}
}
