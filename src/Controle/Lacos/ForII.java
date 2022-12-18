package Controle.Lacos;

public class ForII {
	public static void main(String[] args) {
		solucao();
	}
	static void solucao() {
		for(int counter = 10; counter >= 0; counter -= 2) {
			System.out.printf("Contador = %d\n", counter);
		}
	}
	static void miniDesafio(int maxNumber) {
		for(int counter = maxNumber; counter > 0; counter -= 2) {
			System.out.printf("Contador: %s\n", counter);
		}
	}
	static void miniDesafio() {
		miniDesafio(10);
	}
}
