package curso.Controle.Lacos;

public class Continue {
	public static void main(String[] args) {
		myTest((int i) -> {
			return i == 5;
		});
	}
	interface escape {
		boolean face(int i);
	}
	static void myTest(escape inter) {
		for (int i = 0; i < 10; i++) {
			if(inter.face(i)) {continue;}
			System.out.println(i);
		}
	}	
	static void exampleI() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {continue;}
			System.out.println(i);
		}
	}
	static void exampleII() {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {continue;}
			System.out.println(i);
		}
	}
}
