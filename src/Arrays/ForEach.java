package Arrays;

public class ForEach {
	public static void main(String[] args) {
		exampleI();
	}
	static void exampleI() {
		double[] notas = {9.9, 8.7, 7.2, 9.4};
		for (double nota : notas) {
			System.out.println("Nota: " + nota);
		}
	}
	static void exampleII() {
		double[] notas = {9.9, 8.7, 7.2, 9.4};
		for (int counter = 0; counter < notas.length; counter++) {
			System.out.print(notas[counter] + "\t");
		}
	}
}
