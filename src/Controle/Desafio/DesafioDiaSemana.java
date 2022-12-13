package Controle.Desafio;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		resolucaoDesafio(input);
		input.close();
	}
	static void resolucaoDesafio(Scanner input) {
		System.out.print("Digite o dia: ");
		String day = input.next();
		if (day.equalsIgnoreCase("domingo")) {
			System.out.print(1);
		} else if ("segunda".equalsIgnoreCase(day)) {
			System.out.print(2);
		} else if ("terça".equalsIgnoreCase(day.replace("c", "ç"))) {
			System.out.print(3);
		} else if (day.equalsIgnoreCase("quarta")) {
			System.out.print(4);
		} else if (day.equalsIgnoreCase("quinta")) {
			System.out.print(5);
		} else if (day.equalsIgnoreCase("sexta")) {
			System.out.print(6);
		} else if ("sabado".equalsIgnoreCase(day.replace("á", "a"))) {
			System.out.print(7);
		} else {
			System.out.print("Dia inválido!");
		}
	}
	static void solucaoDesafio(Scanner input) {
		System.out.println(parseDay(input.next()));
		System.out.println(parseDay(input.next()));
		System.out.println(parseDay(input.next()));
		System.out.println(parseDay(input.next()));
		System.out.println(parseDay(input.next()));
		System.out.println(parseDay(input.next()));
		System.out.print(parseDay(input.next()));
	}
	static int parseDay(String day) {
		if (day.toLowerCase().equals("domingo")) {
			return 1;
		} else if (day.toLowerCase().equals("segunda")) {
			return 2;
		} else if (day.toLowerCase().equals("terça")) {
			return 3;
		} else if (day.toLowerCase().equals("quarta")) {
			return 4;
		} else if (day.toLowerCase().equals("quinta")) {
			return 5;
		} else if (day.toLowerCase().equals("sexta")) {
			return 6;
		} else if (day.toLowerCase().equals("sábado")) {
			return 7;
		}
		return 0;
	}
}
