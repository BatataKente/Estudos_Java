package Controle.Lacos;

public class ForIII {
	public static void main(String[] args) {
		exemploIII();
	}
	static void exemploIII() {
		for(int i = 0; i < 10; i ++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%dx%d]", i, j);
			}
			System.out.print("\n");
		}
	}
	static void exemploII() {
		for(int i = 0; i < 10; i ++) {
			System.out.print(i + ": ");
			for(int j = 0; j < 10; j++) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
	}
	static void exemploI() {
		for(int counter = 0; counter < 10; counter++) {
			System.out.print(counter + "\n");
		}
		int counter = 100;
		System.out.print("Saiu do for...\n");
		System.out.print(counter);
	}
}
