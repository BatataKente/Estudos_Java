package apresentacao._8_BaskaraTeste;

import java.util.Scanner;

public class BaskaraTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			do {
				System.out.println("Este programa eh responsavel por calcular baskara");
				System.out.print("Informe o valor de A: ");
				double a = input.nextDouble();
				System.out.print("Informe o valor de B: ");
				double b = input.nextDouble();
				System.out.print("Informe o valor de C: ");
				double c = input.nextDouble();
				Baskara baskara = new Baskara(a, b, c);
				System.out.println(baskara);
				System.out.print("Deseja continuar? (S/N) ");
				if(input.next().equalsIgnoreCase("n")) break;
			} while(true);
		} catch(Exception exception) {
			System.out.println("Erro: Voce informou um valor invalido");
		} finally {
			input.close();
		}
	}
}