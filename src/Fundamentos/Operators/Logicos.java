package Fundamentos.Operators;

public class Logicos {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = 3 > 7;
		System.out.println(a && b);
		System.out.println(a || b);
		System.out.println(a ^ b);
		System.out.println(!a);
		System.out.println(!b);
	}
	static void tabelaVerdadeAnd() {
		System.out.print(
				"\ntrue && true = " + (true && true) + 
				"\ntrue && true = " + (true && false) + 
				"\ntrue && true = " + (false && true) + 
				"\ntrue && true = " + (false && false) + "\n"
		);
	}
	static void tabelaVerdadeOr() {
		System.out.print(
				"\ntrue || true = " + (true || true) + 
				"\ntrue || true = " + (true || false) + 
				"\ntrue || true = " + (false || true) + 
				"\ntrue || true = " + (false || false) + "\n"
		);
	}
	static void tabelaVerdadeXor() {
		System.out.print(
				"\ntrue ^ true = " + (true ^ true) + 
				"\ntrue ^ true = " + (true ^ false) + 
				"\ntrue ^ true = " + (false ^ true) + 
				"\ntrue ^ true = " + (false ^ false) + "\n"
		);
	}
}
