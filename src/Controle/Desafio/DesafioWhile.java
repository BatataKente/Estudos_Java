package Controle.Desafio;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		mySolution(input);
		input.close();
	}
	static void mySolution(Scanner input) {
		String maizalgum = ""; 
		double somaDeTodasAsNotas = 0;
		int totalDeAlunos = 0;
		do {
			System.out.print("Digite a nota de um aluno: ");
			final var nota = input.nextDouble();
			totalDeAlunos += 1;
			if (nota >= 0 && nota <= 10) {
				somaDeTodasAsNotas += nota;
				System.out.print("Tem mais alunos? ");
				maizalgum = input.next();
			} else {
				System.out.print("Você não digitou um valor válido\n");
			}
		} while(
			!(maizalgum.equals("-1") || "nao".equalsIgnoreCase(maizalgum.replace("ã", "a")))
		);
		System.out.print("\nA média da turma é " + somaDeTodasAsNotas/totalDeAlunos);
	}
}
