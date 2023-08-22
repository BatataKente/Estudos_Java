package curso.Fundamentos.String;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		System.out.println("Bom");
		System.out.println("dia!");
		System.out.printf(
				"MegaSena: %d %d %d %d %d %d%n", 1, 2, 3, 4, 5, 6
		);
		System.out.printf("Salário: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "Josicleison");
		Scanner input = new Scanner(System.in);
		System.out.printf("Digite o seu nome: ");
		final var nome = input.nextLine();
		System.out.printf("Digite o seu sobreNome: ");
		String sobreNome = input.nextLine();
		System.out.printf("Digite a sua idade: ");
		int idade = input.nextInt();
		System.out.printf("\nO nome é %s %s e ele tem %d anos", nome, sobreNome, idade);
		input.close();
	}
}
