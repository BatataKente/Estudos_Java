package curso.Controle.Lacos;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a nota: ");
		double nota = input.nextDouble();
		if (nota > 10 || nota < 0) {
			System.out.print("Nota Inválida!");
		} else if (nota >= 7) {
			System.out.print("Aluno aprovado!");
		} else if (nota >= 4) {
			System.out.print("Aluno de recuperação!");
		} else {
			System.out.print("Aluno reprovado!");
		}
		input.close();
	}
}
