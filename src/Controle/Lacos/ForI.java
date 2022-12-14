package Controle.Lacos;

public class ForI {
	public static void main(String[] args) {
		convencionalFor();
	}
	static void convencionalFor() {
		for (int counter = 20; counter >= 0; counter --) {
			System.out.println("contagem: " + counter);
		}
	}
	static void alternativeWayToUseFor() {
		int x = 2;
		for (; x < 10;) {
			System.out.println("contagem: " + x);
			x++;
		}
	}
	static void infiniteFor() {
		for (;;) {
			System.out.println("Lero Lero");
		}
	}
}
