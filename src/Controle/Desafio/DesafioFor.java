package Controle.Desafio;

public class DesafioFor {
	public static void main(String[] args) {
		mySolution(2);
	}
	static void mySolution(int maxLenght) {
		for (String valor = "#"; valor.length() <= maxLenght; valor += "#") {
			System.out.print(valor + "\n");
		}
	}
	static void mySolution() {
		mySolution(5);
	}
}
