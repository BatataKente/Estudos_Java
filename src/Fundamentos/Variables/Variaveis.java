package Fundamentos.Variables;

public class Variaveis {
	public static void main(String[] args) {
		final var a = 4.5;
		final double b = 5.9;
		double c;
		c = 29.46;
		byte d = 12;
		short e = 233;
		long f = 86;
		var nome = "Josicleison";
		System.out.print(
				"a: " + a + 
				"\nb: " + b + 
				"\nc: " + c + 
				"\nd: " + d + 
				"\ne: " + e + 
				"\nf: " + f + 
				"\nO nome do cara é " + nome
		);
		nome = "Josicleide";
		System.out.print("\nMas agora é " + nome);
	}
}
