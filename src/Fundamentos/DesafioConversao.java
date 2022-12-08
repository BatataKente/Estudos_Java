package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Digite o seu nome: ");
		final var nome = input.nextLine();
		System.out.printf("O nome é %s", nome);
		input.close();
	}
}
