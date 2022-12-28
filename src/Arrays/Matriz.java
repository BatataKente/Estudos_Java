package Arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		mySolution(input);
		input.close();		
	}
	static void mySolution(Scanner input) {
		var numberOfNotes = 0;
		var numberOfStudents = 0;
		System.out.print("Quantos alunos tem na turma? ");
		numberOfStudents = input.nextInt();
		System.out.print("Quantas notas você deseja informar? ");
		numberOfNotes = input.nextInt();
		double[][] notas = new double[numberOfStudents][numberOfNotes];
		for (int studentId = 0; studentId < notas.length; studentId++) {
			double total = 0; 
			System.out.print("\nAluno " + (studentId + 1) + "\n");
			for (int counter = 0; counter < notas[studentId].length; counter++) {
				System.out.print("\tDigite a nota " + (counter + 1) + ": ");
				notas[studentId][counter] = input.nextDouble();
				total += notas[studentId][counter];
			}
			System.out.printf("\nA média do aluno é: %.2f\n", total/notas.length);
		}
	}
}
