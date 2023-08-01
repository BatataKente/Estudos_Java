package curso.Controle.Lacos;

public class BreakRotulado {
	public static void main(String[] args) {
		example();
		System.out.println();
		myTest(1, "2", 3.0);
	}
	static void myTest(
			int lero, String leroLeroLero, double leroLero
	) {
		System.out.printf("%.0f", lero + Double.parseDouble(leroLeroLero) + leroLero);
	}
	static void example() {
		external: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1) {
					break external;
				}
				System.out.printf("[%dx%d] ", i, j);
			}
			System.out.print("\n");
		}
		System.out.print("\nFim!");
	}
}
