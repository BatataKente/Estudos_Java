package Controle.Lacos;

import java.util.Scanner;

public class WhileI {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		solution(input);
		input.close();
	}
	static void mySolution(Scanner input) {
		String quit = null;
		do {
			System.out.print("Lero Lero");
			quit = input.next();
		} while (!quit.equalsIgnoreCase("sair"));
	}
	static void solution(Scanner input) {
		String valor = "";
		while (!"sair".equalsIgnoreCase(valor)) {
			System.out.print("Digite alguma coisa: ");
			valor = input.next();
		}
	}
}
