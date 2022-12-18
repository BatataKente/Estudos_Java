package Controle.Desafio;

public class DesafioFor {
	public static void main(String[] args) {
		solution();
	}
	static void solution() {
		for (String value = "#"; !value.equals("######"); value += "#") {
			System.out.print(value + "\n");
		}
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
