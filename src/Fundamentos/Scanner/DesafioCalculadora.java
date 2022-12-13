package Fundamentos.Scanner;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		final var input = new Scanner(System.in);
		desafioSolucao(input);
		input.close();
	}
	static void desafioSolucao(Scanner input) {
		print("informe o valor \"a\": ");
		final double numero = input.nextDouble();
		print("informe o valor \"b\": ");
		final double outroNumero = input.nextDouble();
		print("Informe a operação: ");
		final var operacao = input.next();
		double resultado = "+".equals(operacao) ? numero + outroNumero : 0;
		resultado = "-".equals(operacao) ? numero - outroNumero : resultado;
		resultado = "*".equals(operacao) ? numero * outroNumero : resultado;
		resultado = "/".equals(operacao) ? numero / outroNumero : resultado;
		resultado = "%".equals(operacao) ? numero % outroNumero : resultado;
		printf("%.0f %s %.0f = %.1f", numero, operacao, outroNumero, resultado);
	}
	static void desafioCompleted(Scanner input) {
		final var phrase = input.nextLine();
		final var words = phrase.split(" ");
		final var a = Double.parseDouble(words[0]);
		final var b = Double.parseDouble(words[2]);
		switch (words[1]) {
			case "+": displayResult(phrase, a + b); break;
			case "-": displayResult(phrase, a - b); break;
			case "*": displayResult(phrase, a * b); break;
			case "/": displayResult(phrase, a / b); break;
			case "%": displayResult(phrase, a % b); break;
		};
	}
	static void displayResult(String calculation, double result) {
		System.out.printf("O resultado da operação %s é %.0f\n", calculation, result);
	}
	static void print(String sentense) {
		System.out.print(sentense);
	}
	static void printf(String sentense, Object... object) {
		System.out.printf(sentense, object);
	}
}
