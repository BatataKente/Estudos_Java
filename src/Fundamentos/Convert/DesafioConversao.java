package Fundamentos.Convert;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		final var a = convertStringToDouble(input.next());
		System.out.print("Digite um outro valor: ");
		final var b = convertStringToDouble(input.next());
		System.out.print("Digite outro ainda: ");
		final var c = convertStringToDouble(input.next());
		System.out.printf("A soma dos valores é %.2f e a média é %.2f", a + b + c, (a + b + c)/3);
		input.close();
	}
	static double convertStringToDouble(String value) {
		return Double.parseDouble(value.replace(",", "."));
	}
}
