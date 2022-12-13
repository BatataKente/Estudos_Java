package Controle.Desafio;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(parseDay(input.next()));
		System.out.println(parseDay(input.next()));
		System.out.println(parseDay(input.next()));
		System.out.println(parseDay(input.next()));
		System.out.println(parseDay(input.next()));
		System.out.print(parseDay(input.next()));
		input.close();
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
