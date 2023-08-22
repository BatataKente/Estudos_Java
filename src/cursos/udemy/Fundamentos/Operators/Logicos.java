package curso.Fundamentos.Operators;

public class Logicos {
	public static void main(String[] args) {
		tabelaVerdadeAnd();
		tabelaVerdadeNot();
		tabelaVerdadeOr();
		tabelaVerdadeXor();
	}
	static void tabelaVerdadeAnd() {
		System.out.print(
				"\nTabela verdade AND:" + 
				"\ntrue && true = " + (true && true) + 
				"\ntrue && false = " + (true && false) + 
				"\nfalse && true = " + (false/* && true*/) + 
				"\nfalse && false = " + (false/* && false*/) + "\n"
		);
	}
	static void tabelaVerdadeOr() {
		System.out.print(
				"\nTabela verdade OR:" + 
				"\ntrue || true = " + (true/* || true*/) + 
				"\ntrue || false = " + (true/* || false*/) + 
				"\nfalse || true = " + (false || true) + 
				"\nfalse || false = " + (false || false) + "\n"
		);
	}
	static void tabelaVerdadeXor() {
		System.out.print(
				"\nTabela verdade XOR:" + 
				"\ntrue ^ true = " + (true ^ true) + 
				"\ntrue ^ false = " + (true ^ false) + 
				"\nfalse ^ true = " + (false ^ true) + 
				"\nfalse ^ false = " + (false ^ false) + "\n"
		);
	}
	static void tabelaVerdadeNot() {
		System.out.print(
				"\nTabela verdade NOT:" + 
				"\n!true = " + !true + 
				"\n!false = " + !false + "\n"
		);
	}
}
