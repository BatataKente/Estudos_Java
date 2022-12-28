package Arrays;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		solution(input);
		input.close();
	}
	static void solution(Scanner input) {
		System.out.print("Quantas notas: ");
		var numberOfNotes = input.nextInt();
		double[] notas = new double[numberOfNotes];
		for (int counter = 0; counter < notas.length; counter++) {
			System.out.print("Informe a nota " + (counter + 1) + ": ");
			notas[counter] = input.nextDouble();
		}
		double total = 0;
		for (double nota : notas) {
			total += nota;
		}
		double media = total/notas.length;
		System.out.printf("\nA média é %.2f", (media));
	}
	static void mySolutionI(Scanner input) {
		var numberOfNotes = 0;
		System.out.print("Quantas notas você quer informar? ");
		numberOfNotes = input.nextInt();
		double[] notas = new double[numberOfNotes];
		for (int counter = 0; counter < notas.length; counter++) {
			System.out.print("Digite a nota " + (counter + 1) + ": ");
			notas[counter] = input.nextDouble();
		}
		double total = 0; 
		for (double nota : notas) {
			total += nota;
		}
		System.out.printf("\nA média do aluno é: %.2f", total/notas.length);
	}
	static void mySolutionII(Scanner input) {
		var numberOfNotes = 0;
		System.out.print("Quantas notas você quer informar? ");
		numberOfNotes = input.nextInt();
		double[] notas = new double[numberOfNotes];
		double total = 0; 
		for (int counter = 0; counter < notas.length; counter++) {
			System.out.print("Digite a nota " + (counter + 1) + ": ");
			notas[counter] = input.nextDouble();
			total += notas[counter];
		}
		System.out.printf("\nA média do aluno é: %.2f", total/notas.length);
	}
}
