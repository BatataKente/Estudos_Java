package curso.Controle.Lacos;

public class ContinueRotulado {
	public static void main(String[] args) {
		example();
	}
	static void example() {
		external: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1) {
					continue external;
				}
				System.out.printf("[%d;%d] ", i, j);
			}
			System.out.print("\n");
		}
		System.out.print("\nFim!");
	}
}
