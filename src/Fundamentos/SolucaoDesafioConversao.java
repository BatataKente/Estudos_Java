package Fundamentos;

import java.util.Scanner;

public class SolucaoDesafioConversao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Informe o primeiro valor: ");
		String a = input.next().replace(",", ".");
		System.out.print("Informe o segundo valor: ");
		String b = input.next().replace(",", ".");
		System.out.print("Informe o terceiro valor: ");
		String c = input.next().replace(",", ".");
		final double da = Double.parseDouble(a);
		final var db = Double.parseDouble(b);
		final Double dc = Double.parseDouble(c);
		System.out.printf("\nA média dos salários é: %.2f", (da + db + dc)/3);
		input.close();
	}
}
