package Fundamentos.Operators;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		scannerNextExercice(entrada);
		entrada.close();
	}
	static void firstExercice(String wordToCompare) {
		System.out.println(wordToCompare == "2");
		String palavra = new String(wordToCompare);
		System.out.println(wordToCompare == palavra);
		System.out.print(wordToCompare.equals(palavra));
	}
	static void  scannerNextLineExercice(Scanner entrada) {
		String outraPalavra = entrada.nextLine();
		System.out.print("2".equals(outraPalavra.trim()) + "\n");
	}
	static void  scannerNextExercice(Scanner entrada) {
		String outraPalavra = entrada.next();
		System.out.print("2".equals(outraPalavra) + "\n");
	}
}
