package Controle.Lacos;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Informe a média: ");
		double media = input.nextDouble();
		showCongratulations(media <= 10 && media >= 7);
		if (media >= 5 && media < 7) {
			System.out.print("Recuperação.");
		}
		if (media >= 0 && media < 5) {
			System.out.print("Reprovado.");
		}
		input.close();
	}
	static void showCongratulations(boolean condition) {
		if (condition) {
			System.out.print("Você foi aprovado.");
			System.out.print(" Parabéns!");
		}
	}
	static void showCongratulations() {
		System.out.print("Você foi aprovado.");
		System.out.print(" Parabéns!");
	}
}
