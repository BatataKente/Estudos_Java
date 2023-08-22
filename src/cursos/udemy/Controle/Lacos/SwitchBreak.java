package curso.Controle.Lacos;

import java.util.Scanner;

public class SwitchBreak {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Informe a nota: ");
		solution((int) input.nextDouble());
		input.close();
	}
	static void solution(Scanner input) {
		var conceito = "?";
		System.out.print("Informe a nota: ");
		int nota = input.nextInt();
		switch (nota) {
			case 10: case 9: {
				conceito = "A"; break;
			}
			case 8: case 7: {
				conceito = "B"; break;
			}
			case 6: case 5: {
				conceito = "C"; break;
			}
			case 4: case 3: {
				conceito = "D"; break;
			}
			case 2: case 1: {
				conceito = "E"; break;
			}
			case 0: {
				conceito = "F"; break;
			}
		}
		System.out.printf("Conceito: %s", conceito);
	}
	static void solution(int nota) {
		var conceito = "?";
		switch (nota) {
			case 10: case 9: {
				conceito = "A"; break;
			}
			case 8: case 7: {
				conceito = "B"; break;
			}
			case 6: case 5: {
				conceito = "C"; break;
			}
			case 4: case 3: {
				conceito = "D"; break;
			}
			case 2: case 1: {
				conceito = "E"; break;
			}
			case 0: {
				conceito = "F"; break;
			}
		}
		System.out.printf("Conceito: %s", conceito);
	}
}
