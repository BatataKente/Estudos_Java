package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Digite um valor: ");
		final var a = Double.parseDouble(input.nextLine());
		System.out.printf("Digite um outro valor: ");
		final var b = Double.parseDouble(input.nextLine());
		System.out.printf("A soma dos valores é %.0f", a + b);
		input.close();
	}
}
