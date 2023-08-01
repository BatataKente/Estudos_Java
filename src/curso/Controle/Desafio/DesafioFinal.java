package curso.Controle.Desafio;

import java.util.Random;
import java.util.Scanner;

public class DesafioFinal {
	static final int randomNumber = randomNumber();
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.print(
			"1. " + isEvenGreaterThanZeroLesserThanTen(10) +
			"\n2. " + isLeapYear(366) + 
			"\n3. " + studentGradeResult(5, 9) + 
			"\n4. " + isPrimeNumber(23) + 
			"\n5. " + primeNumberSwitch(23) + 
			"\n6. " + randomNumber + 
			"\n7. " + playGame(input, 1) + 
			"\n8. " + playSumNumbers(input) + 
			"\n9. " + greaterInt(numbers)
		);
		input.close();
	}
	static boolean isEven(int number) {
		return number % 2 == 0;
	}
	static boolean isEvenGreaterThanZeroLesserThanTen(int number) {
		return isEven(number) && number > 0 && number < 10;
	}
	static boolean isLeapYear(int numberOfDays) {
		return isEven(numberOfDays);
	}
	static String studentGradeResult(double notaI, double notaII) {
		final var media = (notaI + notaII)/2;
		var resultado = "Reprovado";
		if(media >= 7) {
			resultado = "Aprovado";
		} else if(media > 4) {
			resultado = "Recuperação";
		}
		return resultado;
	}
	static boolean isPrimeNumber(int number) {
		for (int counter = 2; counter < number; counter++) {
			if(number % counter == 0) {return false;}
		}
		return true;
	}
	static boolean primeNumberSwitch(int number) {
		switch(number) {
			case 1: case 3: case 5: 
			case 7: case 11: case 13: 
			case 17: case 19: case 23: return true;
			default: return false;
		}
	}
	static int randomNumber() {
		final var random = new Random();
		final var number = random.nextInt(100);
		return number;
	}
	static String playGame(Scanner input, int tentativasMaximas) {
		for (int tentativas = 0; tentativas <= tentativasMaximas-1; tentativas++) {
			System.out.printf("Tentativa %d: tente descobrir qual é o número: ", tentativas);
			var number = input.nextInt();
			if (number == randomNumber) {
				return "Congratulations, Voce acertou!!"; 
			}
			System.out.print("Você errou\n");
		}
		return "Você perdeu";
	}
	static String playGame(Scanner input) {
		final var randomNumber = randomNumber();
		for (int tentativas = 0; tentativas <= 10; tentativas++) {
			System.out.printf("Tentativa %d: tente descobrir qual é o número: ", tentativas);
			var number = input.nextInt();
			if (number == randomNumber) {
				return "Congratulations, Voce acertou!!"; 
			}
			System.out.print("Você errou\n");
		}
		return "Você perdeu";
	}
	static int playSumNumbers(Scanner input) {
		var total = 0;
		var number = 0;
		System.out.print("Digite números positivos para serem somados, ou negativo para sair.\n");
		do {
			number = input.nextInt();
			System.out.printf("%d + %d = ", total, number);
			System.out.printf("%d\n", total += number);
		} while(number > 0);
		return total;
	}
	static int greaterInt(int[] numbers) {
		var greater = 0;
		for(int number: numbers) {
			if (number > greater) {greater = number;}
		}
		return greater;
	}
}