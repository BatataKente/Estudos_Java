package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		solution(input);
		input.close();
	}
	static void solution(Scanner input) {
		System.out.print("Quantos alunos? ");
		var numberOfAlunos = input.nextInt();
		System.out.print("Quantas notas por aluno? ");
		var numberOfNotas = input.nextInt();
		double[][] notasDaTurma = new double[numberOfAlunos][numberOfNotas];
		double total = 0;
		for (int student = 0; student < notasDaTurma.length; student++) {
			System.out.println();
			for (int note = 0; note < notasDaTurma[student].length; note++) {
				System.out.printf("Informe a nota %d do aluno %d: ", note + 1, student + 1);
				notasDaTurma[student][note] = input.nextDouble();
				total += notasDaTurma[student][note];
			}
		}
		double media = total/(numberOfAlunos*numberOfNotas);
		System.out.printf("\nA media da turma é %.2f\nNotas da turma: ", media);
		for (double[] notasDoAluno : notasDaTurma) {
			System.out.print(Arrays.toString(notasDoAluno) + " ");
		}
	}
	static void mySolution(Scanner input) {
		System.out.print("Quantos alunos tem na turma? ");
		var numberOfStudents = input.nextInt();
		System.out.print("Quantas notas você deseja informar? ");
		var numberOfNotes = input.nextInt();
		double[][] notas = new double[numberOfStudents][numberOfNotes];
		double total = 0;
		for (int studentId = 0; studentId < notas.length; studentId++) {
			double  studentTotal = 0; 
			System.out.print("\nAluno " + (studentId + 1) + "\n");
			for (int counter = 0; counter < notas[studentId].length; counter++) {
				System.out.print("\tDigite a nota " + (counter + 1) + ": ");
				notas[studentId][counter] = input.nextDouble();
				studentTotal += notas[studentId][counter];
			}
			var media = studentTotal/notas[studentId].length;
			total += media;
			System.out.printf("\nA média do aluno é: %.2f\n", media);
		}
		System.out.printf("\nA média da turma é: %.2f\n", total/notas.length);
	}
}
