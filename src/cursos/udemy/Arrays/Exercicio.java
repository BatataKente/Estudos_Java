package curso.Arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		test();
	}
	static void test() {
		double[] notas = new double[3];
		notas[0] = 7.9;
		notas[1] = 8;
		notas[2] = 6.7;
		System.out.println(Arrays.toString(notas));
		System.out.println(notas[0]);
		System.out.println(notas[notas.length-1]);
		double total = 0;
		for (int counter = 0; counter < notas.length; counter++) {
			total += notas[counter];
		}
		System.out.println(total/notas.length);
		final double notaArmazenada = 5.9;
		double[] outrasNotas = {6.9, 8.9, notaArmazenada, 10};
		double outroTotal = 0;
		for (int counter = 0; counter < outrasNotas.length; counter++) {
			outroTotal += outrasNotas[counter];
		}
		System.out.println(outroTotal/outrasNotas.length);
	}
}
