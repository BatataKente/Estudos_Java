package curso.Fundamentos.Clousure;

public class Interface {
	public static void main(String[] args) {
		forZeroUntil(10, () -> {
			System.out.print("Lero Lero\n");
		});
	}
	interface escape {
		void face();
	}
	static void forZeroUntil(int value, escape inter) {
		for (int i = 0; i <= value; i++) {
			inter.face();
		}
	}
}
