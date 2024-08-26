package curso.Controle.Lacos;

public class whileDeterminado {
	public static void main(String[] args) {
		repeat(10);
	}
	static void repeat(int limit) {
		var counter = 1;
		while (counter <= limit) {
			System.out.printf("contagem = %d\n", counter);
			counter++;
		}
	}
}
